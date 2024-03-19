package homework.homework_1.example_3;

public class MultiTwo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running ...");
    }

    public static void main(String[] args) {
        MultiTwo multiTwo = new MultiTwo();
        Thread m2 = new Thread(multiTwo);
        m2.start();
    }
}
