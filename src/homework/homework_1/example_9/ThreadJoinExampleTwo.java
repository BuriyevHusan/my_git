package homework.homework_1.example_9;

class ABC extends Thread {
    Thread threadToInterrupt;

    public void run() {
        threadToInterrupt.interrupt();
    }
}


public class ThreadJoinExampleTwo {
    public static void main(String[] argvs) {
        try {
            ABC th1 = new ABC();
            th1.threadToInterrupt = Thread.currentThread();
            th1.start();
            th1.join();
        } catch (InterruptedException ex) {
            System.out.println("The exception has been caught. " + ex);
        }
    }
}

class TestJoinMethod1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        TestJoinMethod1 t1 = new TestJoinMethod1();
        TestJoinMethod1 t2 = new TestJoinMethod1();
        TestJoinMethod1 t3 = new TestJoinMethod1();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
