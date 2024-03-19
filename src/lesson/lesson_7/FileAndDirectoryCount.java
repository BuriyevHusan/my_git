package lesson.lesson_7;

import java.io.File;

public class FileAndDirectoryCount {
    public static int countFolder = 0;
    public static int countFile = 0;

    public static void main(String[] args) {
        File file = new File("C:/Users/buriy/IdeaProjects/modul_4/io_file");
        count(file);
        System.out.println(countFolder);
        System.out.println(countFile);
    }

    public static void count(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    countFolder++;
                    count(file1);
                } else {
                    countFile++;
                }
            }
        }
    }
}
