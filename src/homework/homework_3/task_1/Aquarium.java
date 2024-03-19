package homework.homework_3.task_1;


import java.util.Random;
import java.util.Vector;

public class Aquarium {
    public static void main(String[] args) {
        // [0, 1)
        Random random = new Random();
        Vector<MyThread> threads = new Vector<>();
        int males = random.nextInt(20);
        int females = random.nextInt(30);
        for (int i = 0; i < males; i++) {
            MyThread myThread = new MyThread(new Fish(true));
            threads.add(myThread);
        }
        for (int i = 0; i < females; i++) {
            MyThread myThread = new MyThread(new Fish(false));
            threads.add(myThread);
        }
        for (MyThread thread : threads) {
            thread.start();
        }
        while (!threads.isEmpty()) {
            for (MyThread i : threads) {
                for (MyThread j : threads) {
                    if ((i.getFish().isGender() && !j.getFish().isGender()) ||
                            (!i.getFish().isGender() && j.getFish().isGender())) {
                        if (i.getFish().getHeight() == j.getFish().getHeight() &&
                                i.getFish().getWeight() == j.getFish().getWeight()) {
                            MyThread myThread1 = new MyThread(new Fish(random.nextBoolean()));
                            threads.add(myThread1);
                            myThread1.start();
                        }
                    }
                }
            }
            for (MyThread thread : threads) {
                System.out.println(thread.getFish());
                if (thread.isAlive()) {
                    thread.interrupt();
                }
            }
        }
    }

}
