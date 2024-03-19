package homework.homework_1.task_1;

public class TestThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("MyThread start");
    }
}
