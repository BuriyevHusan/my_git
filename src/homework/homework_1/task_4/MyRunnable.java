package homework.homework_1.task_4;

public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        System.out.println("MyRunnable name : " + this.name);
        System.out.println("1 sec uxladi");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }

    public String getName() {
        return name;
    }
}
