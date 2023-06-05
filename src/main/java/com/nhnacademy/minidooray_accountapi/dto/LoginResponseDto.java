package com.nhnacademy.minidooray_accountapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDto {
    private String userUUID;

    private String userId;

    private String userNickname;

    private String userPassword;

    private String userEmail;
}
