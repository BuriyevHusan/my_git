package homework.homework_7.login.projeck_shablon.back.service;


import homework.homework_7.login.projeck_shablon.back.DTO.SignInDTO;
import homework.homework_7.login.projeck_shablon.back.DTO.SignUpDTO;
import homework.homework_7.login.projeck_shablon.back.DTO.UserDTO;

public interface AuthService {
    UserDTO signIn(SignInDTO signInDTO);

    UserDTO signUp(SignUpDTO dto);

    void allUsers();
}
