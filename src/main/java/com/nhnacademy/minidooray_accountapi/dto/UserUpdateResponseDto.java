package com.nhnacademy.minidooray_accountapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateResponseDto {

    private String userId;

    private String userNickname;

    private String userEmail;
}
