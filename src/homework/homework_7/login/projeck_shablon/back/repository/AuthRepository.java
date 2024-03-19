package homework.homework_7.login.projeck_shablon.back.repository;

import homework.homework_7.login.projeck_shablon.back.model.User;

public interface AuthRepository {
    User findByUserNameOrEmail(String userNameOrEmail);

    User save(User user);
    public abstract void showUsers();
}
