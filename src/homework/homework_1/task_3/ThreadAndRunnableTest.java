package homework.homework_1.task_3;

public class ThreadAndRunnableTest {
    public static void main(String[] args) {
        MyThreadTest th1 = new MyThreadTest("MyThread");
        Thread th2 = new Thread(new MyRunnableTest("MyRunnable"));
        th1.start();
        th2.start();
    }
}
