package homework.homework_7.task;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
    private File file;

    public MyFile(String name) {
        file = new File(name);
    }

    public void write() {
        try (FileWriter fileWriter = new FileWriter(file)) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            fileWriter.write(str);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void reader() {
        try (FileReader fileReader = new FileReader(file)) {
            StringBuilder str = new StringBuilder();
            while (fileReader.ready()) {
                str.append((char) fileReader.read());
            }
            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
class MyFileTest{
    public static void main(String[] args) {
        MyFile myFile = new MyFile("io_file/my_file.txt");
        myFile.write();
        myFile.reader();
    }
}
