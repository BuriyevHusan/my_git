package homework.homework_2.tic_tac_toe;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MyTicTacToe {
    private final static String typeO = "⭕";
    private final static String typeX = "❎";
    private final static String[] board = new String[]{
            "✅", "✅", "✅",
            "✅", "✅", "✅",
            "✅", "✅", "✅"
    };
    public static Scanner scanInt = new Scanner(System.in);
    public static Scanner scanStr = new Scanner(System.in);
    public static Random random = new Random();
    public static boolean isType = false;


    public static void main(String[] args) {

        show(board);
        int a;
        while (!checkWin(board)) {
            a = random.nextInt(1, 10) - 1;
            if (!checkEmptySlot(a)) {
                continue;
            }
            if (!isType) {
                board[a] = typeX;
                isType = true;
            } else {
                board[a] = typeO;
                isType = false;
            }
            show(board);
        }
        if (checkWin(board)) {
            System.out.println("\n-----------WON------------");
        }
        if (!checkWin(board)) {
            System.out.println("\n----------DRAW------------");
        }
    }

    public synchronized static boolean checkEmptySlot(int num) {
        return board[num].equals("✅");
    }

    public synchronized static boolean checkWin(String[] str) {
        // 0 1 2
        // 3 4 5
        // 6 7 8
        String winX = "❎❎❎";
        String winO = "⭕⭕⭕";
        String[] winCase = new String[]{
                str[0] + str[1] + str[2],
                str[3] + str[4] + str[5],
                str[6] + str[7] + str[8],

                str[0] + str[3] + str[6],
                str[1] + str[4] + str[7],
                str[2] + str[5] + str[8],

                str[0] + str[4] + str[8],
                str[2] + str[4] + str[6]
        };
        for (String string : winCase) {
            if (string.equals(winO)) {
                return true;
            }
            if (string.equals(winX)) {
                return true;
            }
        }
        return false;
    }

    public synchronized static void show(String[] str) {
        System.out.print("\n---------Board---------");
        for (int i = 0; i < str.length; i++) {
            if (i % 3 == 0) {
                System.out.println();
            }
            System.out.print((i + 1) + " = " + str[i] + "   ");
        }
    }

    public synchronized static String getStr(String string) {
        return scanStr.next();
    }

    public synchronized static int getInt(String string) {
        return scanInt.nextInt();
    }
}
