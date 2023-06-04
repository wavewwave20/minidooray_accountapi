package com.nhnacademy.minidooray_accountapi.controller;

import com.nhnacademy.minidooray_accountapi.dto.AccountDto;
import com.nhnacademy.minidooray_accountapi.dto.AccountRegisterDto;
import com.nhnacademy.minidooray_accountapi.service.AccountRegisterService;
import com.nhnacademy.minidooray_accountapi.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountRestController {

    private final AccountService accountService;
    private final AccountRegisterService accountRegisterService;

    @GetMapping("/api/account")
    public List<AccountDto> getAccount() {
        return accountService.getAllAccount();
    }

    @GetMapping("/api/account/{id}")
    public AccountDto getAccountDetail(Long id) {
        return accountService.getAccountDetail(id);
    }

    @PostMapping("/api/account")
    public AccountRegisterDto postAccount(AccountRegisterDto accountRegisterDto) {
        return accountRegisterService.registerAccount(accountRegisterDto);
    }

    @PutMapping("/api/account/{id}")
    public AccountRegisterDto putAccount(Long id, AccountRegisterDto accountRegisterDto) {
        return accountRegisterService.updateAccount(id, accountRegisterDto);

    }

    @DeleteMapping("/api/account/{id}")
    public void deleteAccount(Long id) {
        accountRegisterService.deleteAccount(id);
    }


}
