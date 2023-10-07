package org.multithreading;

import java.sql.SQLOutput;

public class ThreeThreadsWritingNoSequentially {

    static volatile int  count = 0;
    static volatile String currentThread = "1";
    static Object object = new Object();
    public static void main(String[] args) {

        Runnable runnable =new Runnable() {
            @Override
            public void run() {
                try{
                System.out.println(Thread.currentThread().getName());
                while(count<=20) {
                    synchronized (this) {
                        if (!currentThread.equals(Thread.currentThread().getName())) {
                            object.wait();
                        } else {
                            count++;
                            System.out.println("Thread " + Thread.currentThread().getName() + " count " + count);
                            if (Thread.currentThread().getName().equals("1")) {
                                currentThread = "2";
                            } else if (Thread.currentThread().getName().equals("2")) {
                                currentThread = "3";
                            } else if (Thread.currentThread().getName().equals("3")) {
                                currentThread = "1";
                            }
                            object.notifyAll();
                        }
                    }
                }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread1 = new Thread(runnable, "1");
        Thread thread2 = new Thread(runnable, "2");
        Thread thread3 = new Thread(runnable, "3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
