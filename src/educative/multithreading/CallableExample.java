package educative.multithreading;

import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future future1 = executorService.submit(new CallableTask());
        Future future2 = executorService.submit(new CallableTask());
        Future future3 = executorService.submit(new CallableTask());
        Future future4 = executorService.submit(new CallableTask());

        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        System.out.println(future4.get());

        executorService.shutdown();

    }

}


class CallableTask implements Callable {

    @Override
    public Object call() throws Exception {
        Thread.sleep(2000);
        return "New future returned";
    }
}
