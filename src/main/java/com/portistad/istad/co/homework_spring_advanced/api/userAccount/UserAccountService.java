package com.portistad.istad.co.homework_spring_advanced.api.userAccount;


import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;

public interface UserAccountService {
    EntityModel<?> findByIdUserAccount(Long id);
    CollectionModel<?> findAllUserAccount();
}
