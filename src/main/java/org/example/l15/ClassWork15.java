package org.example.l15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ClassWork15 {
    static AtomicInteger count = new AtomicInteger(0);
    //static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        List list1 = Collections.synchronizedList(list);
        list.add(200);
        list.add(343);



        MyThread myThread = new MyThread();
        MyThread2 myThread2 = new MyThread2();

        myThread.start();
        myThread2.start();
        Thread.sleep(100);

        System.out.println(count);
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++){
                getCount();
            }
        }
    }

    static class MyThread2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++){
                getCount();
            }
        }
    }

    /*
    public synchronized static int getCount(){
        return count++;
    }


    public static int getCount(){
        synchronized (ClassWork15.class){
            return count++;
        }
    }
    */
    public static int getCount(){
        return count.incrementAndGet();
    }

}
