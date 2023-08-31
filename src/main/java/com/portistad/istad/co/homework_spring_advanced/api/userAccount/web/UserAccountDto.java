package com.portistad.istad.co.homework_spring_advanced.api.userAccount.web;


import com.portistad.istad.co.homework_spring_advanced.api.account.Account;
import com.portistad.istad.co.homework_spring_advanced.api.user.User;

public record UserAccountDto(
        Long id,
        Boolean isDisabled,
        User user,
        Account account
) {

}
