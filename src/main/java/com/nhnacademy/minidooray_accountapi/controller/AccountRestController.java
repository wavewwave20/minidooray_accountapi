package com.nhnacademy.minidooray_accountapi.controller;

import com.nhnacademy.minidooray_accountapi.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountRestController {

    private final AccountService accountService;

    @GetMapping("/api/account")
    public String getAccount() {
        accountService.getAllAccount();
    }
}
