package com.vitaminncpp.chess.services.user;

import com.vitaminncpp.chess.dto.user.UserDto;
import org.springframework.stereotype.Service;

@Service

public class UserService implements IUserService {
    public UserDto saveUser() {
        return new UserDto();
    }

    @Override
    public UserDto createUser(UserDto user) {
        return null;
    }
}
