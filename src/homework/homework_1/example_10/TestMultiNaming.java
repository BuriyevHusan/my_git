package homework.homework_1.example_10;

public class TestMultiNaming extends Thread {
    @Override
    public void run() {
        System.out.println("running...");
    }

    public static void main(String[] args) {
        TestMultiNaming test1 = new TestMultiNaming();
        TestMultiNaming test2 = new TestMultiNaming();
        System.out.println("Name of test1 : " + test1.getName());
        System.out.println("Name of test2 : " + test2.getName());
        test1.start();
        test2.start();
        test1.setName("Test1");
        test2.setName("Test2");
        System.out.println("Name of test1 : " + test1.getName());
        System.out.println("Name of test2 : " + test2.getName());
    }
}
