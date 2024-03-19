package homework.homework_3.task_6;

import java.util.Objects;

public final class ImmutableClass {
    private final int counter;

    public ImmutableClass(int counter) {
        this.counter = counter;
    }

    public ImmutableClass() {
        this.counter = 0;
    }

    public synchronized int add(int addTwo) {
        return this.counter + addTwo;
    }

    public synchronized int remove(int remove) {
        return this.counter - remove;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ImmutableClass that = (ImmutableClass) object;
        return counter == that.counter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(counter);
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "counter=" + counter +
                '}';
    }
}
