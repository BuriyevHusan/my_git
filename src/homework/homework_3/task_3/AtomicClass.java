package homework.homework_3.task_3;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClass {
    AtomicInteger sum = new AtomicInteger();

    public void counter() {
        sum.getAndIncrement();
    }

    public AtomicInteger getSum() {
        return sum;
    }
}
