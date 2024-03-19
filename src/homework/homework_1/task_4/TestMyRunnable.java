package homework.homework_1.task_4;

public class TestMyRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable("MyRunnable"));
        thread.start();
    }
}
