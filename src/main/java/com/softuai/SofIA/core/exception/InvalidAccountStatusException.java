package com.softuai.SofIA.core.exception;

public class InvalidAccountStatusException extends RuntimeException {
    public InvalidAccountStatusException(String code) {
        super("Invalid AccountStatus code: " + code);
    }
}
