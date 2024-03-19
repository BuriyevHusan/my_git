package lesson.lesson_4.task_4;

import java.util.Arrays;
import java.util.concurrent.*;

public class CallableTask {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        MyCallable myCallable = new MyCallable(arr, 10, 15);
        Future<Integer> future = executor.submit(myCallable);
        System.out.println(Arrays.toString(arr));
        System.out.println(future.get());
        executor.shutdown();
    }
}

class MyCallable implements Callable<Integer> {
    private int[] ints;
    private int from;
    private int to;
    private boolean bool;

    public MyCallable(int[] ints, int from, int to) {
        this.ints = ints;
        this.from = from;
        this.to = to;
        bool = true;
    }

    public MyCallable(int[] ints) {
        this.ints = ints;
        bool = false;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        if (bool) {
            for (int i = from; i < to; i++) {
                sum += ints[i];
            }
        } else {
            for (int i = 0; i < ints.length; i++) {
                sum += ints[i];
            }
        }
        return sum;
    }
}
