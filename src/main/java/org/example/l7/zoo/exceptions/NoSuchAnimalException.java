package org.example.l7.zoo.exceptions;

import java.util.NoSuchElementException;

public class NoSuchAnimalException extends NoSuchElementException {
    public NoSuchAnimalException() {
        super();
    }

    public NoSuchAnimalException(String s) {
        super(s);
    }
}
