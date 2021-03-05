package org.example.l7.zoo.exceptions;

public class NotUniqueAnimalException extends IllegalArgumentException {
    public NotUniqueAnimalException() {
        super();
    }

    public NotUniqueAnimalException(String s) {
        super(s);
    }

    public NotUniqueAnimalException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotUniqueAnimalException(Throwable cause) {
        super(cause);
    }
}
