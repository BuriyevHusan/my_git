package homework.homework_2.tak_2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Count {
    private int counter;
    private Lock lock = new ReentrantLock();

    public Count(int counter) {
        this.counter = counter;
    }

    public Count() {
        counter = 0;
    }

    public synchronized void countOne() {
        this.counter++;
    }

    public void countTwo() {
        synchronized (Count.class) {
            this.counter++;
        }
    }

    public void countThree() {
        lock.lock();
        this.counter++;
        lock.unlock();
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
