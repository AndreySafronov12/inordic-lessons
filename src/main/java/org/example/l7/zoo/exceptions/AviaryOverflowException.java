package org.example.l7.zoo.exceptions;

public class AviaryOverflowException extends IndexOutOfBoundsException {
    public AviaryOverflowException() {
        super();
    }

    public AviaryOverflowException(String s) {
        super(s);
    }

    public AviaryOverflowException(int index) {
        super(index);
    }
}
