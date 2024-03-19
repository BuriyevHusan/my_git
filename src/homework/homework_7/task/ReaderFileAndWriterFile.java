package homework.homework_7.task;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderFileAndWriterFile {
    private String name;

    public ReaderFileAndWriterFile() {
    }

    public void readerAndWriter(String name, String fileName) {
        this.name = name;
        try (
                FileReader fileReader = new FileReader(this.name);
                FileWriter fileWriter = new FileWriter(fileName)
        ) {
            while (fileReader.ready()) {
                fileWriter.write((char) fileReader.read());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Test {
    public static void main(String[] args) {
        ReaderFileAndWriterFile file = new ReaderFileAndWriterFile();
        file.readerAndWriter("io_file/my_file.txt", "io_file/reader_and_writer.txt");
    }
}
