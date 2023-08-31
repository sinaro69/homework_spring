package com.portistad.istad.co.homework_spring_advanced.api.account.web;


import com.portistad.istad.co.homework_spring_advanced.api.accountType.AccountType;
import com.portistad.istad.co.homework_spring_advanced.api.userAccount.UserAccount;
import jakarta.validation.constraints.Min;
import lombok.Builder;

import java.util.List;

@Builder
public record AccountDto (


        String actName,
        String actNo,
        @Min(value = 0, message = "not")
        Double transferLimit,
        String pin,
        String uuid,
        List<UserAccount> userAccounts,
        AccountType accountTypes
) {
}
