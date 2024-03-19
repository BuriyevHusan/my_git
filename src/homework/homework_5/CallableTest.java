package homework.homework_5;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws Exception {
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
        // task tugagan yoki tugamagani bildiradi
        System.out.println(future.isDone());
        // get qiymat oladi
        System.out.println(future.get());
        // threads larni o'chiradi
        executorService.shutdown();
    }
}
