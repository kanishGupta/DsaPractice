package org.multithreading;

import java.sql.SQLOutput;

public class ThreeThreadsWritingNoSequentially12 {

    private volatile Integer count = 1;
    private volatile Integer threadIdToRun = 1;
    private Object object = new Object();

    public static void main(String[] args) {

        TestClass testClass = new TestClass();
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
            System.out.println("incremented value : " + count++);
        }
    }
}
