package org.example.l15.threads_operator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        Thread thread0 = new Thread();
        WaitThread thread1 = new WaitThread();
        RunThread thread2 = new RunThread();
        Thread thread3 = new Thread();

        List<Thread> threadList = Arrays.asList(thread0, thread1, thread2, thread3);

        threadList.get(1).start();
        threadList.get(2).start();
        threadList.get(3).start();

        getStatusOfThreads(threadList);

        workWithThreads(threadList);

        getStatusOfThreads(threadList);
    }

    public static void getStatusOfThreads(List<Thread> threadList) {
        for (Thread thread: threadList ) {
            System.out.println(thread.getName() + " - " + thread.getState());
        }
    }

    public static void workWithThreads(List<Thread> threadList) {
        for (Thread thread: threadList ) {
            switch (thread.getState()) {
                case NEW:
                    thread.start();
                    break;
                case TERMINATED:
                    System.out.println("Priorty - " + thread.getPriority());
                    break;
                case WAITING:

                    thread.interrupt();

                    break;
                case RUNNABLE:
                    System.out.println("IsInterrupted - " + thread.isInterrupted());
                    break;
            }
        }
    }
}
