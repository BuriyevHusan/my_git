package homework.homework_2.tak_1;

public class Counter {
    private int sum = 0;

    public Counter() {
    }

    public Counter(int sum) {
        this.sum = sum;
    }

    public synchronized void counterOne() {
        setSum(getSum() + 1);
    }

    public void counterTwo() {
        synchronized (this) {
            setSum(getSum() + 1);
        }
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
