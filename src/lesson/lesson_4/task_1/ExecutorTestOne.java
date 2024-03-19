package lesson.lesson_4.task_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTestOne {
    public static void main(String[] args) {
        System.out.println("Call the func");
        func();
    }

    public static void func() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            System.out.println(Thread.currentThread() + " - is worked");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + (i + 1));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + "\nfinished");
        });
    }
}
