package homework.homework_5;

import java.util.concurrent.*;

public class FutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = () -> {
            int sum = 0;
            for (int i = 0; i < 1001; i++) {
                sum += i;
                System.out.println("Name : " + Thread.currentThread().getName() +
                        " , " + "Active count : " + Thread.activeCount());
                Thread.sleep(30);
            }
            return sum;
        };
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Integer> future = executorService.submit(callable);
        while (!future.isDone()){
            System.out.println("In Progress");
            Thread.sleep(1000);
        }
        System.out.println(future.get());
        executorService.shutdown();
    }
}
