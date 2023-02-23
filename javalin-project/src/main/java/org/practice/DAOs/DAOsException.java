package org.practice.DAOs;

public class DAOsException extends Exception{
    public DAOsException() {
    }

    public DAOsException(String message) {
        super(message);
    }

    public DAOsException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOsException(Throwable cause) {
        super(cause);
    }

    public DAOsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
