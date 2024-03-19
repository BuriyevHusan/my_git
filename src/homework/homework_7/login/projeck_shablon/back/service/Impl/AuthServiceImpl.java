package homework.homework_7.login.projeck_shablon.back.service.Impl;


import homework.homework_7.login.projeck_shablon.back.DTO.SignInDTO;
import homework.homework_7.login.projeck_shablon.back.DTO.SignUpDTO;
import homework.homework_7.login.projeck_shablon.back.DTO.UserDTO;
import homework.homework_7.login.projeck_shablon.back.model.User;
import homework.homework_7.login.projeck_shablon.back.repository.AuthRepository;
import homework.homework_7.login.projeck_shablon.back.repository.Impl.AuthRepositoryImpl;
import homework.homework_7.login.projeck_shablon.back.service.AuthService;

public class AuthServiceImpl implements AuthService {

    private static final AuthRepository repository = AuthRepositoryImpl.getInstance();
    private static final AuthService instance = new AuthServiceImpl();

    private AuthServiceImpl() {
    }

    public static AuthService getInstance() {
        return instance;
    }

    @Override
    public UserDTO signIn(SignInDTO dto) {
        User user = repository.findByUserNameOrEmail(dto.userNameOrEmail());
        if (user!=null){
            return new UserDTO(user);
        }
        throw new RuntimeException("user not fount");
    }

    @Override
    public UserDTO signUp(SignUpDTO dto) {
        User userNameOrEmail = repository.findByUserNameOrEmail(dto.userName());
        User user;
        if (userNameOrEmail == null) {
            user = repository.save(new User(dto.name(), dto.userName(),
                    dto.password(), dto.email()));
            return new UserDTO(user);
        } else {
            throw new RuntimeException("User name or Email ol Ready fount");
        }
    }

    @Override
    public void allUsers() {
        repository.showUsers();
    }
}
