package lesson.lesson_1.example_1;

public class TestOne {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());
    }
}
