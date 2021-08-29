package head_first;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.function.Supplier;


class MySupplier implements Supplier<Integer> {

    @Override
    public Integer get() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //Do nothing
        }
        return 1;
    }
}

class PlusOne implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer x) {
        return x + 1;
    }
}

public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> f = CompletableFuture.supplyAsync(new MySupplier());
        System.out.println(f.isDone());
        CompletableFuture<Integer> f2 = f.thenApply(new PlusOne());
        Thread.sleep(1000);
        CompletableFuture<Integer> f3 = f2.thenApply(new PlusOne());
        System.out.println(f2.get());
        System.out.println(f3.get());
    }
}
