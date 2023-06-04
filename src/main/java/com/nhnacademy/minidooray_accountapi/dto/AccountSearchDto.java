package com.nhnacademy.minidooray_accountapi.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//#TODO:Account관련 DB 확정 및 DTO 명시적으로 수정

@Getter
@Setter
@RequiredArgsConstructor
public class AccountSearchDto {
    private Long accountUUID;
    private Long accountId;
    private String accountNickName;
    private String accountEmail;
}
