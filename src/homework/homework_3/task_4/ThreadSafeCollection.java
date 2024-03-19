package homework.homework_3.task_4;

import java.util.Vector;

public class ThreadSafeCollection {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(4);
        vector.add(56);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(0);
        vector.add(1);
        System.out.println(vector);
    }
}
