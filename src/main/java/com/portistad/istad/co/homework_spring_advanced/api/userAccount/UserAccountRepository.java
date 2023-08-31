package com.portistad.istad.co.homework_spring_advanced.api.userAccount;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount,Long> {
    Optional<UserAccount> findByUser_UuidAndAccount_Uuid(String userUuid, String accountUuid);
    List<UserAccount> findByUserUuid(String uuid);
}
