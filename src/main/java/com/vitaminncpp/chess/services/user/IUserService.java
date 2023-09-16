package com.vitaminncpp.chess.services.user;

import com.vitaminncpp.chess.dto.user.UserDto;
import org.springframework.stereotype.Service;


@Service
public interface IUserService {
    public UserDto createUser(UserDto user);
}
