package org.example.l15.threads_operator;

import java.util.Scanner;

public class RunThread extends Thread {
    @Override
    public void run() {
        new Scanner(System.in).nextLine();
    }


}
