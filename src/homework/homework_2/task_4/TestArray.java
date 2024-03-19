package homework.homework_2.task_4;

import java.util.Random;

public class TestArray {
    public static void main(String[] args) throws InterruptedException {
        int[][] matrix = new int[5000][5000];

        Runnable runnable = () -> {
            for (int n = 0; n < 100; n++) {
                int finalN = n;
                new Thread(() -> {
                    for (int i = finalN * (matrix.length / 100); i < (finalN + 1) * (matrix.length / 100); i++) {
                        for (int j = 0; j < 5_000; j++) {
                            matrix[i][j] = (int) (Math.random() * 10);
                        }
                    }
                }).start();
            }
        };
        Thread thread = new Thread(runnable);
        long lth1 = System.currentTimeMillis();
        System.out.print("\n\n\nAfter Threads : " + lth1 + "\n\n\n");
        thread.start();
        thread.join();
        long lth2 = System.currentTimeMillis();
        System.out.println("\n\n\nBefore Threads : " + lth2 + "\n\n\n");
        System.out.println(lth2 - lth1);

        System.gc();

        long l1 = System.currentTimeMillis();
        System.out.println("\n\n\nLongkirish : " + l1 + "\n\n\n");
        for (int i = 0; i < 5000; i++) {
            for (int j = 0; j < 5000; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        long l2 = System.currentTimeMillis();
        System.out.println("\n\n\nLong tugatish : " + l2 + "\n\n\n");
        System.out.println(l2 - l1);
    }
}
