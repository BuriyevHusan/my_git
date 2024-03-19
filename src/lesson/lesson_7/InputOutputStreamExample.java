package lesson.lesson_7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class InputOutputStreamExample {
    public static void main(String[] args) {
        //output();
        input();

    }

    private static void output() {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream("io_file/file_output_input_stream.txt", true)
        ) {
            byte[] bytes = "Mana senga olam olam gul".getBytes();
            System.out.println(Arrays.toString(bytes));
            fileOutputStream.write(bytes);
        } catch (Exception e) {
            throw new RuntimeException();
        }

        // yana  bir usuli
        /*
        FileOutputStream os = null;
        try {
            os = new FileOutputStream("io/readme.txt", true);
            byte[] bytes = "Salom bu Java G38 а qashqirlari".getBytes();
            System.out.println(Arrays.toString(bytes));
            os.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }

    private static void input() {
        try (
                FileInputStream fileInputStream = new FileInputStream("io_file/file_output_input_stream.txt")
        ) {
            StringBuilder str = new StringBuilder();
            int k = 0;
            while (k != -1) {
                k = fileInputStream.read();
                str.append((char) k);
            }
            System.out.println(str);

            //simple usul
            /*byte[] bytes = fileInputStream.readAllBytes();
            String str = new String(bytes);
            System.out.println(str);*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
