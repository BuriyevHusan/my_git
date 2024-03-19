package homework.homework_7.task;

import java.io.*;
import java.util.Scanner;

public class BufferedInputOutputStream {
    public static void main(String[] args) {
        writer();
        reader();
    }

    private static void reader() {
        try (
                FileInputStream fileInputStream = new FileInputStream("buffered/readme_stream.txt");
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ) {
            byte[] bytes = bufferedInputStream.readAllBytes();
            String str = new String(bytes);
            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writer() {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream("buffered/readme_stream.txt");
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            bufferedOutputStream.write(str.getBytes());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
