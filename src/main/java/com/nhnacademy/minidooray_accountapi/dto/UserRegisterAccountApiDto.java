package com.nhnacademy.minidooray_accountapi.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class UserRegisterAccountApiDto {

    private String userUUID;
    private String userId;
    private String userNickName;
    private String userEmail;
}