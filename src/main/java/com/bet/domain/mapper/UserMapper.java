package com.bet.domain.mapper;

import com.bet.domain.dto.UserLogInDto;
import com.bet.domain.dto.UserSignUpDto;
import com.bet.domain.entity.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * UserMapper - mapper сущности User
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */

@Mapper
public interface UserMapper {

    UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);


    /**
     *  преоброзовние сущности dto в сущность user
     * @param dto
     * @return возращает user
     */

    @InheritInverseConfiguration
     User mapSignUpDtoToUser(UserSignUpDto dto);



    /**
     *  преоброзование сушности user  в сущность dto
     * @param user
     * @return возращает dto
     *
     */

     UserSignUpDto mapUserToSignUpDto(User user);



}
