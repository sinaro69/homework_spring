package com.portistad.istad.co.homework_spring_advanced.api.account.web;

import lombok.Builder;

@Builder
public record LimitTransferAccountDto(
        String uuid, String actName, Double balance, Double transferLimit
) {
}
