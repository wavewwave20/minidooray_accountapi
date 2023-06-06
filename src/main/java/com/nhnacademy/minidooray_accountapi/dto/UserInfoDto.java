package com.nhnacademy.minidooray_accountapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoDto {
    private String userUUID;

    private String userId;

    private String userNickname;


    private String userEmail;
}
