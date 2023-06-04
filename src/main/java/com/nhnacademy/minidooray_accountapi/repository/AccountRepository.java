package com.nhnacademy.minidooray_accountapi.repository;

import com.nhnacademy.minidooray_accountapi.dto.AccountDto;

public interface AccountRepository extends JpaRepository<AccountDto, Long> {
}