package com.nhnacademy.minidooray_accountapi.repository;

import com.nhnacademy.minidooray_accountapi.dto.AccountDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountDto, Long> {
    AccountDto findAccountByUserId(Long id);

    void deleteByUserId(Long id);
}