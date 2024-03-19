package homework.homework_2.tic_tac_toe;

import static homework.homework_2.tic_tac_toe.MyTicTacToe.*;

public class TestThreadTicTacToe {
    public static boolean isType = false;
    private final static String typeO = "⭕";
    private final static String typeX = "❎";
    private final static String[] board = new String[]{
            "✅", "✅", "✅",
            "✅", "✅", "✅",
            "✅", "✅", "✅"
    };
    public static void main(String[] args) {
        Runnable runnable = () -> {
            MyTicTacToe.show(board);
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
        };
        Thread th1 = new Thread();
        Thread th2 = new Thread();
        th1.start();
        th2.start();
    }
}
