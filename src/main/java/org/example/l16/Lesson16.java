package org.example.l16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson16 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
