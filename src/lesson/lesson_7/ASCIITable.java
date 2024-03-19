package lesson.lesson_7;

public class ASCIITable {
    public static void main(String[] args) {
        for (int i = 0; i < 256; i++) {
            System.out.println((i + 1) + " -> " + (char) i);
        }
    }
}
