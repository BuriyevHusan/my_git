package homework.homework_3.task_1;

import java.util.Random;

public class Fish {
    private final boolean isGender;
    private int weight = (int) (Math.random() * 7);
    private int height = (int) (Math.random() * 5);

    public Fish(boolean isGender) {
        this.isGender = isGender;
    }

    public Fish() {
        isGender = new Random().nextBoolean();
    }

    public boolean isGender() {
        return isGender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "isGender=" + isGender +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
