package homework.homework_1.task_3;

public class MyThreadTest extends Thread{
    private String name;

    public MyThreadTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.print("MyThread name(before) : ");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName(this.name);
        System.out.print("MyThread name(after) : ");
        System.out.println(Thread.currentThread().getName());
    }
}
