package homework.homework_1.task_5;

public class TestThreads {
    public static void main(String[] args) {
        // Runnablening ichidagi run funksiyasi
        // tana qismi shunday yoziladi
        Thread th1 = new Thread(() -> {
            Thread.currentThread().setName("Thread->1");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + (i + 1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        });
        // Runnablening run funksiyasining tana qismini
        // Runnabledan implement omasdan shunday yozza ham bo'ladi
        Runnable runnable = () -> {
            Thread.currentThread().setName("Thread->2");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " => " + (i + 1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        };
        // Tepadagi Runnable interfaceni berib yubordim
        // chunki run funksiyasini tanasini yozdim
        // funksional interfacelarda shunday qilsa bo'ladi
        Thread th2 = new Thread(runnable);
        th1.start();
        th2.start();
    }
}
