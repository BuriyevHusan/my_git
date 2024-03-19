package homework.homework_7.login.projeck_shablon.back.DTO;

import homework.homework_7.login.projeck_shablon.back.model.User;
import java.util.UUID;

public record UserDTO(UUID userId,
                      String name,
                      String userName,
                      String email) {
    public UserDTO (User user){
        this(user.getId(), user.getName(), user.getUserName(), user.getEmail());
    }
}
