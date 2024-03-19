package homework.homework_3.task_1;

public class MyThread extends Thread {
    private final Fish fish;
    private long start;
    private long end;

    public MyThread(Fish fish) {
        this.fish = fish;
    }


    public Fish getFish() {
        return fish;
    }

    @Override
    public void run() {
        start = System.currentTimeMillis();
        while (true) {
            end = System.currentTimeMillis();
            try {
                if (start - end == 1000) {
                    System.out.println("\nO'ldi\n");
                    return;
                }
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("O'ldi ");
                return;
            }
            fish.setHeight((int) (Math.random() * 5));
            fish.setWeight((int) (Math.random() * 7));
        }
    }
}
