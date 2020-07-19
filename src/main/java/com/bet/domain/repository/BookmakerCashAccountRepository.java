package com.bet.domain.repository;

import com.bet.domain.entity.BookmakerCashAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BookmakerCashAccountRepository - репозиторий для сущности денежного счета букмекерской конторы
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 19.07.2020
 */
@Repository
public interface BookmakerCashAccountRepository extends JpaRepository<BookmakerCashAccount,String> {


}
