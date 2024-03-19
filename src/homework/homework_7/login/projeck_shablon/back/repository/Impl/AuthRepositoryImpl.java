package homework.homework_7.login.projeck_shablon.back.repository.Impl;


import homework.homework_7.login.projeck_shablon.back.model.User;
import homework.homework_7.login.projeck_shablon.back.repository.AuthRepository;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuthRepositoryImpl implements AuthRepository {
    private static final String url = "io_file/file.txt";
    private static AuthRepository instance;

    private AuthRepositoryImpl() {
    }

    public static AuthRepository getInstance() {
        if (instance == null) {
            synchronized (AuthRepositoryImpl.class) {
                if (instance == null) {
                    instance = new AuthRepositoryImpl();
                }
            }
        }
        return instance;
    }

    @Override
    public User findByUserNameOrEmail(String userNameOrEmail) {
        List<User> users = read();
        if (users != null)
            for (User user : users) {
                if (user.getEmail().equals(userNameOrEmail) ||
                        user.getUserName().equals(userNameOrEmail)) {
                    return user;
                }
            }
        return null;
    }

    @Override
    public User save(User user) {
        List<User> users = read();
        if (users == null) {
            users = new ArrayList<>();
        }
        users.add(user);
        write(users);
        return user;
    }

    //@SuppressWarnings("unchecked")
    private static void write(List<User> users) {
        try (
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(url))
        ) {
            outputStream.writeObject(users);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private static List<User> read() {
        try (
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(url))
        ) {
            return (List<User>) inputStream.readObject();
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return null;
    }

    public void showUsers() {
        List<User> userList = read();
        if (userList != null)
            userList.forEach(System.out::println);
        else System.out.println("User now");
    }
}
