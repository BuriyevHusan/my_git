package homework.homework_1.example_7;

public class TestThreadTwice extends Thread {
    @Override
    public void run() {
        System.out.println("running...");
    }

    public static void main(String[] args) throws InterruptedException {
        TestThreadTwice test = new TestThreadTwice();
        test.start();
        System.out.println(test.getState());
        //IllegalThreadStateException
        //test.start();
        Thread.sleep(1000);
        System.out.println(test.getState());
    }
}
