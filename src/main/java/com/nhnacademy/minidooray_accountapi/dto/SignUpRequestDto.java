package com.nhnacademy.minidooray_accountapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequestDto {
    private String userId;
    private String password;
    private String userNickName;
    private String userEmail;

}
