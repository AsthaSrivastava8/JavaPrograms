package educative.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLockThread reentrantLockThread = new ReentrantLockThread();
        Thread thread1 = new Thread(reentrantLockThread);
        Thread thread2 = new Thread(reentrantLockThread);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

}

class ReentrantLockThread implements Runnable {

    ReentrantLock mutex = new ReentrantLock();
    int counter = 0;

    @Override
    public void run() {
        try {
            mutex.lock();

            for (int i = 0; i < 10; i++) {
                counter = counter + 1;
                System.out.println(counter);
            }
        } finally {
            mutex.unlock();
        }

    }
}