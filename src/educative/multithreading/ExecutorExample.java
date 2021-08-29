package educative.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new ExecutorTask());
        executorService.execute(new ExecutorTask());
        executorService.execute(new ExecutorTask());
        executorService.execute(new ExecutorTask());

        executorService.shutdown();
    }
}

class ExecutorTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Hi");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}