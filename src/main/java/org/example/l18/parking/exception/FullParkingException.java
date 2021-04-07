package org.example.l18.parking.exception;


public class FullParkingException extends ArrayIndexOutOfBoundsException {
    public FullParkingException() {
        super();
    }

    public FullParkingException(String s) {
        super(s);
    }

    public FullParkingException(int index) {
        super(index);
    }
}
