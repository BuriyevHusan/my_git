package homework.homework_1.example_8;

public class TestCallRunOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Run try->" + (i+1));
            } catch (InterruptedException e) {
                System.out.println("Exception : " + (i + 1));
            }
        }
    }

    public static void main(String[] args) {
        TestCallRunOne test1 = new TestCallRunOne();
        TestCallRunOne test2 = new TestCallRunOne();
        System.out.println("run 1 call method");
        test1.run();
        System.out.println("run 2 call method");
        test2.run();

    }
}
