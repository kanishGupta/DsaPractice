// The standard fix is to enforce a lock ordering → all threads must acquire locks in the same order.

package org.multithreading;

public class DeadlockResolved {

    public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock1...");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (lock2) {
                    System.out.println("Thread 1: Acquired lock2!");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock1) {  // 🔑 same order as t1
                System.out.println("Thread 2: Holding lock1...");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (lock2) {
                    System.out.println("Thread 2: Acquired lock2!");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

// OUTPUT:
// Thread 1: Holding lock1...
// Thread 1: Acquired lock2!
// Thread 2: Holding lock1...
// Thread 2: Acquired lock2!
