package com.vitaminncpp.chess.controllers.auth;

import com.vitaminncpp.chess.dto.api.Response;
import com.vitaminncpp.chess.dto.auth.LoginInfoDto;
import com.vitaminncpp.chess.security.JwtHelper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
@AllArgsConstructor
@Setter
public class Auth {
    private UserDetailsService userDetailsService;
    private AuthenticationManager manager;
    private JwtHelper helper;
    private Logger logger = LoggerFactory.getLogger(Auth.class);


    @PostMapping("/login")
    public ResponseEntity<Response> login(@RequestBody LoginInfoDto request) {
        return new ResponseEntity<>(new Response(), HttpStatus.OK);
    }

    private void doAuthenticate(String email, String password) {

        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
        try {
            manager.authenticate(authentication);

        } catch (BadCredentialsException e) {
            throw new BadCredentialsException(" Invalid Username or Password  !!");
        }

    }

    @ExceptionHandler(BadCredentialsException.class)
    public String exceptionHandler() {
        return "Credentials Invalid !!";
    }

}
