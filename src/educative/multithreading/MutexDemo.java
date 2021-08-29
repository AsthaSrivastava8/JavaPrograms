package educative.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class MutexDemo {
    public static void main(String[] args) throws InterruptedException {
        MutexThread mutexThread = new MutexThread();
        Thread thread1 = new Thread(mutexThread);
        Thread thread2 = new Thread(mutexThread);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class MutexThread implements Runnable {
    int counter = 0;

    Object mutex = new Object();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (mutex) {
                counter = counter + 1;
                System.out.println(counter);
            }
        }
    }
}
