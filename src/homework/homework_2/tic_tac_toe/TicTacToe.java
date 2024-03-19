package homework.homework_2.tic_tac_toe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static String chooseTurn() {
        Random random = new Random();
        return random.nextBoolean() ? "X" : "O";
    }
    static String[] fillBoard() {
        String[] strings = new String[10];
        for (int i = 0; i < 10; i++) {
            strings[i] = String.valueOf(i); // 1 -> "1"
        }
        return strings;
    }
    static void printBoard(String[] board) {
        getSlot(board, 1);
        System.out.println(getSlot(board, 1) + " | " + getSlot(board, 2) + " | " + getSlot(board, 3));
        System.out.println("---------");
        System.out.println(getSlot(board, 4) + " | " + getSlot(board, 5) + " | " + getSlot(board, 6));
        System.out.println("---------");
        System.out.println(getSlot(board, 7) + " | " + getSlot(board, 8) + " | " + getSlot(board, 9));
    }
    static String getSlot(String[] board, int slotNumber) {
        return board[slotNumber];
    }
    public static void main(String[] args) {
        String[] board = fillBoard();
        String turn = chooseTurn();
        printBoard(board);
        System.out.println(turn + " Player first ");
        Scanner scanner = new Scanner(System.in);
        while (!isBoardFull(board)) {
            printBoard(board);
            System.out.print(turn + " enter slot number : ");
            int slotNumber = scanner.nextInt();
            if (!board[slotNumber].equals(String.valueOf(slotNumber))) {
                System.out.println("Slot already taken");
                continue;
            }
            board[slotNumber] = turn;
            if (checkWin(board, turn)) {
                System.out.println("Player " + turn + " win )) 😊😊😊");
                return;
            } else {
                turn = turn.equals("X") ? "O" : "X";
            }
        }
        System.out.println("Draw 😒👌😂");
    }
    private static boolean checkWin(String[] board, String turn) {
        String[] winCases = {
                board[1] + board[2] + board[3],
                board[4] + board[5] + board[6],
                board[7] + board[8] + board[9],

                board[1] + board[4] + board[7],
                board[2] + board[5] + board[8],
                board[3] + board[6] + board[9],

                board[1] + board[5] + board[9],
                board[3] + board[5] + board[7]
        };

        for (String winCase : winCases) {
            if (winCase.equals(turn.repeat(3)))
                return true;
        }
        return false;
    }
    private static boolean isBoardFull(String[] board) {
        for (int i = 1; i < board.length; i++) {
            if (board[i].equals(String.valueOf(i)))
                return false;
        }
        return true;
    }
}
