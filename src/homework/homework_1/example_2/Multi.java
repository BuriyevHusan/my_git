package homework.homework_1.example_2;

public class Multi extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running ...");
    }

    public static void main(String[] args) {
        Multi m1 = new Multi();
        m1.start();
    }
}
