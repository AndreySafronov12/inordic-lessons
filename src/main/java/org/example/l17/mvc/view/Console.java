package org.example.l17.mvc.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    public static BufferedReader buf;
    public  String print() {
        String text = null;
        try {
            buf = new BufferedReader(new InputStreamReader(System.in));
            text = buf.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    public static void  close() {

        try {
            buf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
