package homework.homework_1.task_2;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Bu har safar 1s uxlaydi");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
