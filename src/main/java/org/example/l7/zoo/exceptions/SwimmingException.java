package org.example.l7.zoo.exceptions;

public class SwimmingException extends RuntimeException {
    public SwimmingException() {
        super();
    }

    public SwimmingException(String message) {
        super(message);
    }

    public SwimmingException(String message, Throwable cause) {
        super(message, cause);
    }

    public SwimmingException(Throwable cause) {
        super(cause);
    }

    protected SwimmingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
