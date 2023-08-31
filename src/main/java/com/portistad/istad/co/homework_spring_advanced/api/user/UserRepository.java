package com.portistad.istad.co.homework_spring_advanced.api.user;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByIsDeleteFalse();
    Optional<User> findByUuid(String uuid);
}
