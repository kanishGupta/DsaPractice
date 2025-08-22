// What happens here:

// Thread 1 acquires lock1, then waits for lock2.

// Thread 2 acquires lock2, then waits for lock1.

// Both are waiting forever → Deadlock.

// Typical output:

// Thread 1: Holding lock1...
// Thread 2: Holding lock2...
// Thread 1: Waiting for lock2...
// Thread 2: Waiting for lock1...


// Then it hangs.

package org.multithreading;

public class DeadlockExample {

    public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock1...");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 1: Waiting for lock2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Acquired lock2!");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock2...");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 2: Waiting for lock1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: Acquired lock1!");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
