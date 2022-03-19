package Q2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        System.out.printf("###### Start task A #####%n");
        Data sd = new Data(0, 0);
        Procces1 p1 = new Procces1(sd);
        Procces2 p2 = new Procces2(sd);
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(p1);
        executor.execute(p2);
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            System.out.printf("Error: %s%n", e.getMessage());
        }
        System.out.printf("###### End task A #####%n");


    }

}
