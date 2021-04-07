package org.example.l18.parking.exception;

import java.util.NoSuchElementException;

public class CarNotFoundException extends NoSuchElementException {
    public CarNotFoundException() {
        super();
    }

    public CarNotFoundException(String s) {
        super(s);
    }
}
