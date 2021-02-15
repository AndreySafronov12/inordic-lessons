package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.print("Введите номер числа Фибоначчи: ");

        int num = new Scanner(System.in).nextInt();

        System.out.println("Число: " + getFib(num));

    }

    public static int getFib(int n) {

        if (n <= 1) return n;

        return getFib(n - 1) + getFib(n - 2);
    }
}
