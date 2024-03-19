package homework.homework_3.task_2;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    AtomicInteger sum = new AtomicInteger();

    public void counter() {
        sum.getAndIncrement();
    }

    public AtomicInteger getSum() {
        return sum;
    }
}
