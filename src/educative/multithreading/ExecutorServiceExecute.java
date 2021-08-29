package educative.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExecute {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Override the run method
        executorService.execute(() -> System.out.println(
                "This is execute() "
                        + "method example"));

        executorService.shutdown();
    }
}
