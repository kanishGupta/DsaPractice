package org.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

    private volatile AtomicInteger atomicInteger = new AtomicInteger(1);
    private volatile Integer threadIdToRun = 1;
    private Object object = new Object();

    public static void main(String[] args) {

        AtomicIntegerTest testClass = new AtomicIntegerTest();
        Thread t1 = new Thread(testClass.new Printer(1));
        Thread t2 = new Thread(testClass.new Printer(2));
        //Thread t3 = new Thread(testClass.new Printer(3));

        t1.start();
        t2.start();
        // t3.start();
    }

    class Printer implements Runnable {

        private int threadId;

        public Printer(int threadId) {
            super();
            this.threadId = threadId;
        }

        @Override
        public void run() {
            while(atomicInteger.get() <= 10)
            System.out.println(Thread.currentThread().getName()+ " incremented value : " + atomicInteger.incrementAndGet());
        }
    }
}
