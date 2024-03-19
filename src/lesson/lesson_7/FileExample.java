package lesson.lesson_7;

import java.io.File;
import java.io.FileReader;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("io_file/file_example.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.getParent() = " + file.getParent());
        System.out.println("file.delete() = " + file.delete());
    }
}
