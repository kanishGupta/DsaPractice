package org.multithreading;

public class ThreeThreadsWritingNoSequentially {

    private int count = 1;
    private int threadIdToRun = 1;
    private final int MAX = 15; // how many numbers you want to print
    private final Object lock = new Object();

    public static void main(String[] args) {
        ThreeThreadsWritingNoSequentially obj = new ThreeThreadsWritingNoSequentially();

        Thread t1 = new Thread(obj.new Printer(1));
        Thread t2 = new Thread(obj.new Printer(2));
        Thread t3 = new Thread(obj.new Printer(3));

        t1.start();
        t2.start();
        t3.start();
    }

    class Printer implements Runnable {
        private int threadId;

        public Printer(int threadId) {
            this.threadId = threadId;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    // stop condition
                    if (count > MAX) {
                        lock.notifyAll();
                        break;
                    }

                    // if it's not this thread's turn, wait
                    while (threadIdToRun != threadId) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                        if (count > MAX) return;
                    }

                    // print and increment
                    System.out.println("Thread " + threadId + " -> " + count++);
                    
                    // set next thread's turn
                    threadIdToRun = threadIdToRun % 3 + 1;

                    // wake up others
                    lock.notifyAll();
                }
            }
        }
    }
}
