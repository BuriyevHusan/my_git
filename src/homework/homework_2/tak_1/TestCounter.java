package homework.homework_2.tak_1;

public class TestCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable1=()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
                counter.counterOne();
                counter.counterTwo();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }
        };
        Thread th1=new Thread(runnable1, "Thread 1->");
        Thread th2=new Thread(runnable1, "Thread 2->");
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println(counter.getSum());
        System.out.println("end");
    }
}
