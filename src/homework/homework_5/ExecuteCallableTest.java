package homework.homework_5;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecuteCallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        testCallable();
        testRunnable();
    }

    public static void testCallable() throws ExecutionException, InterruptedException {
        Callable<Integer> callable = () -> {
            int sum = 0;
            for (int i = 0; i < 15; i++) {
                sum += i;
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(100);
            }
            return sum;
        };
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(callable);
        System.out.println(future.get());
        executor.shutdown();
    }

    public static void testRunnable() {
        AtomicInteger sum = new AtomicInteger();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Runnable runnable = () -> {
            for (int i = 0; i < 15; i++) {
                sum.addAndGet(i);
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        executor.execute(runnable);
        executor.shutdown();
        System.out.println(sum.get());
    }
}
