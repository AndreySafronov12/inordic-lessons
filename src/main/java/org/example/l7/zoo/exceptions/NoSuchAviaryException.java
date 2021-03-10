package org.example.l7.zoo.exceptions;

import java.util.NoSuchElementException;

public class NoSuchAviaryException extends NoSuchElementException {
    public NoSuchAviaryException() {
        super();
    }

    public NoSuchAviaryException(String s) {
        super(s);
    }
}
