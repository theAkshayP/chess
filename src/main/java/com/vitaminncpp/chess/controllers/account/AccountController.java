package com.vitaminncpp.chess.controllers.account;

import com.vitaminncpp.chess.config.APIConfig;
import com.vitaminncpp.chess.dto.api.Response;
import com.vitaminncpp.chess.dto.user.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AccountController {
    @PostMapping(APIConfig.USER)
    @ResponseBody
    public Response register(@RequestBody UserDto user) {
        return null;
    }
}
