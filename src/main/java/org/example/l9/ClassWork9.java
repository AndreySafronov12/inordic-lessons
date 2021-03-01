package org.example.l9;

import org.example.l9.exception.MyRuntimeException;

public class ClassWork9 {
    public static void main(String[] args) {
        try {
            int a = 5/0;
        }
        catch (ArithmeticException e) {
            System.err.println("Ошибка!");
            e.printStackTrace();
        }


        throw new MyRuntimeException();

    }
}
