package com.nseit.Application.exception;

public class UnableToInsertException extends RuntimeException {
    public UnableToInsertException(String msg) {
        super(msg);
    }
}