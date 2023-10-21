package com.vitaminncpp.chess.controllers.account;

import com.vitaminncpp.chess.config.APIConfig;
import com.vitaminncpp.chess.dto.api.Response;
import com.vitaminncpp.chess.dto.user.UserInfoDto;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(APIConfig.USER)
public class AccountController {
    @PostMapping()
    @ResponseBody
    public Response register(@RequestBody UserInfoDto user) {
        System.out.println(user);
        Response res = new Response();
        res.setData(user);
        return res;
    }
}
