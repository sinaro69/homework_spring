package com.portistad.istad.co.homework_spring_advanced.api.userAccount;


import com.portistad.istad.co.homework_spring_advanced.api.userAccount.web.UserAccountDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserAccountMapper {
    UserAccountMapper INSTANCE = Mappers.getMapper(UserAccountMapper.class);
    UserAccountDto mapUserAccountToUserAccountDto(UserAccount userAccount);

    List<UserAccountDto> mapListUserAccountToListUserAccount(List<UserAccount> userAccounts);
}
