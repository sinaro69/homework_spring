package com.portistad.istad.co.homework_spring_advanced.api.account;


import com.portistad.istad.co.homework_spring_advanced.api.account.web.AccountDto;
import com.portistad.istad.co.homework_spring_advanced.api.account.web.CreateAccountDto;
import com.portistad.istad.co.homework_spring_advanced.api.account.web.LimitTransferAccountDto;
import com.portistad.istad.co.homework_spring_advanced.api.account.web.RenameAccountDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);
    AccountDto mapAccountToAccountDto(Account account);
    List<AccountDto> mapListAccountToListAccountDto(List<Account> accounts);
    Account accountToCreateAccount(CreateAccountDto createAccountDto);
    Account renameAccountDtoToAccount(RenameAccountDto renameAccountDto);
    Account limitTransferAccountDtoToAccount(LimitTransferAccountDto limitTransferAccountDto);
}
