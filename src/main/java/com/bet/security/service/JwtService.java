package com.bet.security.service;

import com.bet.security.UserDetailsImpl;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * JwtService - сервис для работы с JWT токеном
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 11.07.2020
 */
@Component
public class JwtService {

    private static final Logger logger = LoggerFactory.getLogger(JwtService.class);

    @Value("${jwtSecret}")
    private String jwtSecret;

    @Value("${jwtExpirationMs}")
    private int jwtExpirationMs;

    private final static String HEADER = "Authorization";



    public String parseJwt(HttpServletRequest request) {
        String headerAuth = request.getHeader(HEADER);
        return headerAuth;
    }

    /**
     *  создание JWT имени пользователя, даты, срока действия, секрета
     * @param authentication
     * @return
     */

    public String generateJwtToken(Authentication authentication) {

        UserDetailsImpl userPrincipial = (UserDetailsImpl) authentication.getPrincipal();
        return Jwts.builder()
                .setSubject(userPrincipial.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }

    /**
     *  получение имени пользователя
     * @param token
     *
     */

    public String getUserNameFromJwtToken(String token){
        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
    }

    /**
     * подтверждение JWT
     * @param authoToken
     *
     */

    public boolean validateJwtToken(String authoToken) {
        try{
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(authoToken);
            return true;
        } catch(SignatureException e){
            logger.error("Не валидная JWT подпись: {}", e.getMessage());
        } catch(MalformedJwtException e){
            logger.error("Неверный JWT токен: {}", e.getMessage());
        } catch(ExpiredJwtException e){
            logger.error("Срок действия JWT токена истек: {}", e.getMessage());
        } catch(UnsupportedJwtException e){
            logger.error("JWT токен не поддерживается: {}", e.getMessage());
        } catch(IllegalArgumentException e){
            logger.error("Пустое значение JWT: {}", e.getMessage());
        }

        return false;
    }
}
