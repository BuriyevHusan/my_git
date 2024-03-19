package lesson.lesson_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        File file = new File("io_file/file_reader.txt");
        try (FileReader fileReader = new FileReader(file)) {
            while (fileReader.ready()) {
                System.out.print((char) fileReader.read());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
