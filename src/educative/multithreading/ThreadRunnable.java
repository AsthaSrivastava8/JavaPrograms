package educative.multithreading;

class ThreadRunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread");
    }
}

public class ThreadRunnable {
    public static void main(String[] args) throws InterruptedException {
        ThreadRunnableDemo threadRunnableDemo1 = new ThreadRunnableDemo();
        Thread thread1 = new Thread(threadRunnableDemo1);

        ThreadRunnableDemo threadRunnableDemo2 = new ThreadRunnableDemo();
        Thread thread2 = new Thread(threadRunnableDemo2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread1.join();
    }

}