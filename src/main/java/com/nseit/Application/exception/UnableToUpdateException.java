package com.nseit.Application.exception;

public class UnableToUpdateException extends RuntimeException {
    public UnableToUpdateException(String msg) {
        super(msg);
    }
}