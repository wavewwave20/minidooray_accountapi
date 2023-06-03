package com.nhnacademy.minidooray_accountapi.exception;

public class InvaildUUIDRequest extends RuntimeException{
    public InvaildUUIDRequest() {
        super("UUID request is invalid");
    }
}
