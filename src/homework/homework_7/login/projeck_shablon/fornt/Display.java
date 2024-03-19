package homework.homework_7.login.projeck_shablon.fornt;


import homework.homework_7.login.projeck_shablon.back.DTO.SignInDTO;
import homework.homework_7.login.projeck_shablon.back.DTO.SignUpDTO;
import homework.homework_7.login.projeck_shablon.back.DTO.UserDTO;
import homework.homework_7.login.projeck_shablon.back.service.AuthService;
import homework.homework_7.login.projeck_shablon.back.service.Impl.AuthServiceImpl;
import java.util.Scanner;

public class Display {
    private static final AuthService authService= AuthServiceImpl.getInstance();
    private static final Scanner scanStr=new Scanner(System.in);
    private static final Scanner scanNum=new Scanner(System.in);
    private UserDTO currentUser;
    private static boolean isLogin = false;

    public void homePack() {
        System.out.println("---------- User Auth ------------");
        while (true) {
            while (!isLogin) {
                showRegistration();

                String auth = getString("Choose => ");

                isLogin = switch (auth) {
                    case "1" -> signIn();
                    case "2" -> signUp();
                    default -> false;
                };
            }
            int n=getNum("choose -> ");
            switch (n){
                case 1->{
                    authService.allUsers();
                    isLogin=false;
                }
            }
        }
    }

    private boolean signUp() {
        try {
            System.out.println("---------------Sign Up ------------------");
            String name=getString("Name -> ");
            String userName=getString("User name -> ");
            String password=getString("Password -> ");
            String email=getString("Email -> ");
            currentUser=authService.signUp(new SignUpDTO(name,userName,password,email));
            System.out.println("User Ro'yaxtdan o'ttdi ->");
            System.out.println(currentUser);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean signIn() {
        try {
            System.out.println("---------------Sign In ------------------");
            String userNameOrEmail = getString("UserName Or Email ->  ");
            String password = getString("Password ->  ");
            currentUser = authService.signIn(new SignInDTO(userNameOrEmail, password));
            System.out.println("User Tizimga kirdi");
            System.out.println(currentUser);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private void showRegistration() {
        System.out.println("Registration");
        System.out.println("1 ==> signIn");
        System.out.println("2 ==> signUP");
    }
    private String getString(String mess){
        System.out.print(mess);
        return scanStr.nextLine();
    }
    private int  getNum(String mess){
        System.out.print(mess);
        return scanNum.nextInt();
    }
}
