package com.vitaminncpp.chess.services.user;

import com.vitaminncpp.chess.dto.user.UserInfoDto;
import org.springframework.stereotype.Service;

@Service

public class UserService implements IUserService {
    public UserInfoDto saveUser() {
        return new UserInfoDto();
    }

    @Override
    public UserInfoDto createUser(UserInfoDto user) {
        return null;
    }
}
