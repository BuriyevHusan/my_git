package homework.homework_7.task;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutputStream {
    public static void main(String[] args) {
        output();
        input();
    }

    private static void output() {
        try (FileWriter fileWriter = new FileWriter("io_file/output.txt")) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Satr kiriting : ");
            String str = scanner.nextLine();
            fileWriter.write(str);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void input() {
        try (FileReader fileReader = new FileReader("io_file/output.txt")) {
            StringBuilder str = new StringBuilder();
            int k = 0;
            while (k != -1) {
                k = fileReader.read();
                str.append((char) k);
            }
            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
