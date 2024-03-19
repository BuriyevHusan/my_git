package homework.homework_1.example_6;

import java.util.Arrays;

public class TestSleepMethodOne extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Sleep Thread");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        TestSleepMethodOne t1=new TestSleepMethodOne();
        TestSleepMethodOne t2=new TestSleepMethodOne();

        t1.start();
        t2.start();
    }
}
