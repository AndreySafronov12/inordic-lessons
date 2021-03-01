package org.example.l7.zoo.exceptions;

public class SwimmException extends RuntimeException {
    public SwimmException() {
        super();
    }

    public SwimmException(String message) {
        super(message);
    }

    public SwimmException(String message, Throwable cause) {
        super(message, cause);
    }

    public SwimmException(Throwable cause) {
        super(cause);
    }

    protected SwimmException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
