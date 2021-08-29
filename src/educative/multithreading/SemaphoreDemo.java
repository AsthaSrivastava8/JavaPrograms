package educative.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) throws InterruptedException {
        SemaphoreThread semaphoreThread = new SemaphoreThread();

        Thread thread1 = new Thread(semaphoreThread);
        Thread thread2 = new Thread(semaphoreThread);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}

class SemaphoreThread implements Runnable {

    int counter = 0;
    Semaphore semaphore = new Semaphore(1);

    @Override
    public void run() {
        try {
            semaphore.acquire();
            for (int i = 0; i < 10; i++) {
                counter += 1;
                System.out.println(counter);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}