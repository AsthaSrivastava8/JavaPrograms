package educative.multithreading;

import java.util.concurrent.*;

public class ExecutorServiceSubmit {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        // Overriding the call method
        Future obj = executorService.submit((Callable<Object>) () -> {
            System.out.println(
                    "This is submit() "
                            + "method example");

            return "Returning Callable "
                    + "Task Result";
        });
        System.out.println("Returned: " + obj.get());
        executorService.shutdown();
    }
}
