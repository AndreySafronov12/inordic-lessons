package org.example.l7.zoo.exceptions;

public class AviaryArrayOverflowException extends IndexOutOfBoundsException {
    public AviaryArrayOverflowException() {
        super();
    }

    public AviaryArrayOverflowException(String s) {
        super(s);
    }

    public AviaryArrayOverflowException(int index) {
        super(index);
    }
}
