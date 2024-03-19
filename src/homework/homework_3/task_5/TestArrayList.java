package homework.homework_3.task_5;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> integers = new ArrayList<>();
        Runnable runnable = () -> {
            for (int i = 0; i < 200; i++) {
                integers.add(i);
            }
        };
        Thread thread1 = new Thread(runnable, "Thread1->");
        Thread thread2 = new Thread(runnable, "Thread2->");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(integers);
        System.out.println(integers.size());

    }
}
