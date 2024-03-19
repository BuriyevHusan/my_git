package lesson.lesson_4.task_2;

import java.util.*;

public class Main {
    private static Vector<Fish> fish = new Vector<>();
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        int n = random.nextInt(2, 5);
        int m = random.nextInt(2, 5);
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        for (int i = 0; i < n; i++) {
            fish.add(new Fish(true));
            fish.getLast().start();
        }
        for (int i = 0; i < m; i++) {
            fish.add(new Fish(false));
            fish.getLast().start();
        }
        System.out.println("Acvariumdagi baliqlar **********************************");
        //Thread.sleep(1500);
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < fish.size(); i++) {
                for (int k = i+1; k < fish.size(); k++) {
                    if (fish.get(i).getRow()==fish.get(k).getRow() &&
                            fish.get(k).getColm()==fish.get(i).getColm() &&
                            fish.get(i).isLive() && fish.get(k).isLive() &&
                            fish.get(i).isGender()!=fish.get(k).isGender()){

                        fish.add(new Fish(random.nextBoolean()));
                        fish.getLast().start();
                        break;

                    }
                }
                Thread.sleep(100);
            }
            clearFish();
            System.out.println("********************************************************************************************************************");
        }
    }
    private static synchronized void clearFish(){
        fish.removeIf(f -> !f.isLive());
    }
}
