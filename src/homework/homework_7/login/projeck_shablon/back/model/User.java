package homework.homework_7.login.projeck_shablon.back.model;

import java.io.Serializable;
import java.util.UUID;

public class User implements Serializable {
    private final UUID id = UUID.randomUUID(); //utils
    private String userName; //utils
    private String name;
    private String password;
    private String email; //utils

    public User(String name, String userName, String password, String email) {
        this.userName = userName;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", userName = " + userName +
                ", name = " + name +
                ", password = " + password +
                ", email = " + email;
    }
}
