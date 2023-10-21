package com.vitaminncpp.chess.services.user;

import com.vitaminncpp.chess.dto.user.UserInfoDto;
import org.springframework.stereotype.Service;


@Service
public interface IUserService {
    public UserInfoDto createUser(UserInfoDto user);
}
