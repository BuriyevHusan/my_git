package lesson.lesson_4.task_2;

import java.util.Random;

public class Fish extends Thread {
    private final Random random = new Random();
    private long timeLine;
    private int row;
    private int colm;
    private final boolean gender;
    private boolean isLive;
    private String name;

    public boolean isLive() {
        return isLive;
    }

    public int getRow() {
        return row;
    }

    public int getColm() {
        return colm;
    }

    public Fish(boolean gender) {
        this.isLive = true;
        this.gender = gender;
        timeLine = System.currentTimeMillis();
        row=random.nextInt(1,5);
        colm=random.nextInt(1,5);
    }

    public boolean isGender() {
        return gender;
    }

    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName() + " -> " +
                "baliq tug'ildi" + " jinsi -> " + gender + " ✅"+"  row : "+ row+"  colm : "+colm);
        name = Thread.currentThread().getName();
        while (true) {
            try {
                if ((System.currentTimeMillis() - timeLine) >= 20000) {
                    System.out.println(Thread.currentThread().getName() + " -> " +
                            "baliq o'ldi " + " jinsi -> " + gender + " 🔴");
                    isLive = false;
                    break;
                } else {
                    Thread.sleep(1000);
                    row=random.nextInt(1,5);
                    colm=random.nextInt(1,5);
                }
            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName() + " -> " +
                        "baliq o'ldi " + " jinsi -> " + gender + " 🔴");
                isLive = false;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "gender = " + gender +
                "name = " + name + "\n";
    }
}