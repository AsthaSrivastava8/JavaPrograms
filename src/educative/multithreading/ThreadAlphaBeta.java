package educative.multithreading;

public class ThreadAlphaBeta {
    public static void main(String[] args) throws InterruptedException {
        AlphaBeta alphaBeta = new AlphaBeta();
        Thread alpha = new Thread(alphaBeta);
        Thread beta = new Thread(alphaBeta);
        alpha.setName("alpha");
        beta.setName("beta");

        alpha.start();
        beta.start();

        alpha.join();
        beta.join();
    }
}

class AlphaBeta implements Runnable {

    public void run() {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(i + ": " + threadName);
        }
    }
}