package homework.homework_1.example_5;

public class MyThreadTwo implements Runnable {
    @Override
    public void run() {
        System.out.println("Now the thread is running ...");
    }

    public static void main(String[] args) {
        Runnable r1 = new MyThreadTwo();
        Thread th1 = new Thread(r1, "My new thread");
        th1.start();
        System.out.println(th1.getName());
    }
}
