package lesson.lesson_4.task_2;

import java.util.Date;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorTest {
    private static Executor executor;

    public static void main(String[] args) {
        ExecutorTest1();

    }

    private static void ExecutorTest1() {
        ExecutorService service=Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            Runnable runnable=()->{
                System.out.println(Thread.currentThread().getName()+" -> "+ finalI +"  task -> "+Thread.activeCount());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
            };
            service.execute(runnable);
        }

        service.shutdownNow();
    }

    private static void execute5() {
        ScheduledExecutorService scheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + " -> " + new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("--" + Thread.currentThread().getName() + " finished " + new Date());
        };
        scheduledExecutor.scheduleAtFixedRate(runnable,2,3, TimeUnit.SECONDS);
        //scheduledExecutor.scheduleWithFixedDelay(runnable, 2, 3, TimeUnit.SECONDS);
    }

    private static void execute4() {
        executor = Executors.newScheduledThreadPool(100);
        run();
    }

    private static void executor3() {
        executor = Executors.newFixedThreadPool(20);
        run();
    }

    private static void run() {
        for (int i = 0; i < 100; i++) {
            Runnable run = () -> {
                System.out.println(Thread.currentThread().getName() + " -> " + "task :: " + Thread.activeCount());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            };

            executor.execute(run);
        }
    }


    private static void extracted2() {
        Executor executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 200; i++) {
            Runnable run = () -> {
                System.out.println(Thread.currentThread().getName() + " -> " + "task :: " + Thread.activeCount());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            };

            executor.execute(run);
        }
    }

}
