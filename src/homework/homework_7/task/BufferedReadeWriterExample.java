package homework.homework_7.task;

import java.io.*;
import java.util.List;

public class BufferedReadeWriterExample {
    public static void main(String[] args) {
        writer();
        reader();
    }
    private static void reader() {
        try (
                FileReader fileReader = new FileReader("buffered/readme.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            List<String> collect = bufferedReader.lines().toList();

            for (String string : collect) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void writer() {
        try (
                FileWriter fileWriter = new FileWriter("buffered/readme.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            bufferedWriter.append("used Buffered Writer");
            bufferedWriter.newLine();
            bufferedWriter.append("End");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
