package homework.homework_1.example_4;

public class MyThreadFirst {
    public static void main(String[] args) {
        Thread th1=new Thread("My first thread");
        th1.start();
        System.out.println(th1.getName());
    }
}
