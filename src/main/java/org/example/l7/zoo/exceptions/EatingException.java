package org.example.l7.zoo.exceptions;

public class EatingException extends RuntimeException {
    public EatingException(String message) {
        super(message);
    }

    public EatingException() {
        super();
    }

    public EatingException(String message, Throwable cause) {
        super(message, cause);
    }

    public EatingException(Throwable cause) {
        super(cause);
    }

    public EatingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
