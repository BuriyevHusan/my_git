package homework.homework_7.task;

import java.io.*;

public class InputOutputObject {
    public static void main(String[] args) {
        write();
        read();
    }

    private static void read() {
        try (
                FileInputStream fileInputStream = new FileInputStream("object_file/user_file.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {

            User user = (User) objectInputStream.readObject();
            System.out.println(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void write() {
        User user = new User("Adham", "adham", "ketmon123");
        System.out.println(user);

        try (
                FileOutputStream fileOutputStream = new FileOutputStream("object_file/user_file.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable {
    private String name;
    private String username;
    private String password;

    public User() {
    }

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
