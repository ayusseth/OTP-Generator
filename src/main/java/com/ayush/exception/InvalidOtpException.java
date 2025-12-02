package com.ayush.exception;

public class InvalidOtpException extends RuntimeException{
    public InvalidOtpException(String msg){
        super(msg);
    }
}
