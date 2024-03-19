package homework.homework_7.login.front;

import homework.homework_7.login.back.dto.SingInDTO;

import java.util.Scanner;

public class UserInterface {
    public static final Scanner scannerInt = new Scanner(System.in);
    public static final Scanner scannerStr = new Scanner(System.in);
    public static boolean isLogin = false;
    public static SingInDTO singIn = null;


    public static void main(String[] args) {
        while (!isLogin) {
            showLogin();
            int numOne = getInt("Choose => ");
            switch (numOne) {
                case 1 -> singIn();
                case 2 -> singUp();
                case 3 -> exit();
                default -> System.out.println("<----- Error ----->");
            }
        }
    }

    private static void exit() {
        isLogin = true;
    }

    private static void singUp() {
    }

    private static void singIn() {

    }

    private static String getStr(String string) {
        return scannerStr.next();
    }

    private static int getInt(String string) {
        System.out.print(string);
        return scannerInt.nextInt();
    }

    private static void showLogin() {
        System.out.println("--------------Welcome to ChatX----------------");
        System.out.println("<----- 1 -> SingIn ----->");
        System.out.println("<----- 2 -> SingUp ----->");
        System.out.println("<----- 3 -> Exit ------->");
    }
}
