package org.example.l9.exception;

public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException() {
        super();
        System.err.println("KU!");
    }
}
