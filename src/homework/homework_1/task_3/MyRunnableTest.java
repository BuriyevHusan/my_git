package homework.homework_1.task_3;

public class MyRunnableTest implements Runnable{
    private String name;

    public MyRunnableTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.print("MyRunnable name(before) : ");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName(this.name);
        System.out.print("MyRunnable name(after) : ");
        System.out.println(Thread.currentThread().getName());
    }
}
