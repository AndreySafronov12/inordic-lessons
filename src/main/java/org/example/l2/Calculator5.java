package org.example.l2;

import java.util.Scanner;

public class Calculator5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введите оператор: ");
        var operator = readOperator();
        System.out.print("Введите первое число: ");
        var var1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        var var2 = scanner.nextDouble();

        System.out.println(var1 + " " + operator + " " + var2 + " = " + switchOpr(operator,var1,var2));
    }

    public static String readOperator() {
        var scanner = new Scanner(System.in);
        var opr = scanner.nextLine();
        while (!opr.equals("+") && !opr.equals("-") && !opr.equals("*") && !opr.equals("/") && !opr.equals("mod") &&
                !opr.equals("div") && !opr.equals("^")) {
            System.out.print("Введен недопустимый оператор, \nвведите допустимый (+, -, *, /, div, mod, ^): ");
            opr = scanner.nextLine();
        }
        return opr;
    }

    public static String getSum(double num1, double num2) {
        return String.valueOf(num1 + num2);
    }

    public static String getDif(double num1, double num2) {
        return String.valueOf(num1 - num2);
    }

    public static String getProd(double num1, double num2) {
        return String.valueOf(num1 * num2);
    }

    public static String getQuot(double num1, double num2) {
        if (num2 != 0) return String.valueOf(num1 / num2);
        else return ("Ошибка деления на 0!");
    }

    public static String getMod(double num1, double num2) {
        if (num2 != 0) return String.valueOf(num1 % num2);
        else return ("Ошибка деления на 0!");
    }

    public static String getDiv(double num1, double num2) {
        if (num2 != 0) return String.valueOf((int) (num1 / num2));
        else return ("Ошибка деления на 0!");
    }

    public static String getDegr(double num1, double num2) {
        var result = num1;
        for (int i = 1; i < num2; i++) result *= num1;
        return String.valueOf(result);
    }

    public static String switchOpr(String opr, double var1, double var2) {
        switch (opr) {
            case "+":
                return getSum(var1,var2);
            case "-":
                return getDif(var1,var2);
            case "*":
                return getProd(var1,var2);
            case "/":
                return getQuot(var1,var2);
            case "mod":
                return getMod(var1,var2);
            case "div":
                return getDiv(var1,var2);
            case "^":
                return getDegr(var1,var2);
            default:
                return null;
        }
    }
}
