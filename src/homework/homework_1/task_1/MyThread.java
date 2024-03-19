package homework.homework_1.task_1;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Har safar 1s uxlaydi");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
