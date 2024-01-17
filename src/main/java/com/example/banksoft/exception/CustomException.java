package com.example.banksoft.exception;

public class CustomException extends Throwable {
    private String message;

    public CustomException() {
    }


    public CustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public CustomException(String message) {
        super(message);
    }
}
