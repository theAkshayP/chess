package com.vitaminncpp.chess.services.user;

import com.vitaminncpp.chess.dto.user.UserInfoDto;
import com.vitaminncpp.chess.model.User;
import org.springframework.stereotype.Service;

@Service
public interface IAccountService {
    public User createUser(UserInfoDto user);
}
