package com.nhnacademy.minidooray_accountapi.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "user_accountapi")
public class User {

    @Id
    @Column(name="user_uuid")
    private String userUUID;
    @Column(name="user_id")
    private String userId;

    @Column(name="user_email")
    private String userEmail;

    @Column(name="user_password")
    private String userPassword;

    @Column(name="user_nickname")
    private String userNickname;


    public User(String userId, String userNickname) {
        this.userId = userId;
        this.userNickname = userNickname;
    }

    public User() {

    }
}
