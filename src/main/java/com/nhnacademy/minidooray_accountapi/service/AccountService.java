package com.nhnacademy.minidooray_accountapi.service;

import com.nhnacademy.minidooray_accountapi.dto.AccountDto;
import com.nhnacademy.minidooray_accountapi.dto.AccountRegisterDto;
import com.nhnacademy.minidooray_accountapi.repository.AccountRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 어카운트 조회와 가입과 같은 걸 분리하는게 나을 것 같습니다.
 * 여기선 계정 조회만 하는걸로...
 * #TODO : AccountService를 기능별로 분화시키는게 나을 것 같습니다.
 */

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;

    public List<AccountDto> getAllAccount() {
        return accountRepository.findAll();
    }

    public AccountDto getAccountDetail(Long id) {
        return accountRepository.findAccountByUserId(id);
    }


}
