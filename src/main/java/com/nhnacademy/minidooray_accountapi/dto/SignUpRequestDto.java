package com.nhnacademy.minidooray_accountapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequestDto {
    private String userId;

    private String userPassword;

    private String userNickname;

    private String userEmail;

}
