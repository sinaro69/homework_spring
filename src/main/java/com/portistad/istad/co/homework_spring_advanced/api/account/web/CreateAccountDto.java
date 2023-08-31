package com.portistad.istad.co.homework_spring_advanced.api.account.web;


import com.portistad.istad.co.homework_spring_advanced.api.accountType.AccountType;
import com.portistad.istad.co.homework_spring_advanced.api.userAccount.UserAccount;

import java.util.List;

public record CreateAccountDto(
        Long id,
        String actName,
        String actNo,
        Double transferLimit,
        String pin,
        String uuid,
        List<UserAccount> userAccounts,
        AccountType accountTypes
) {
}
