package com.nhnacademy.minidooray_accountapi.exception;

public class InvalidLoginRequest extends RuntimeException{
    public InvalidLoginRequest() {
        super("login request is invalid");
    }
}
