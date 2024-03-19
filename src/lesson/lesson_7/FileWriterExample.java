package lesson.lesson_7;

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        try (
                FileWriter fileWriter = new FileWriter("io_file/file_writer.txt", true)
        ) {
            fileWriter.append("asdasfealdifgabflafgak a iuafblafa uf\n");
            fileWriter.write("safafiuafbefnsidnvsdkjv\n");
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
