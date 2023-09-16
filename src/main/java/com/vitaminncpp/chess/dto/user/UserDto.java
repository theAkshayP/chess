package com.vitaminncpp.chess.dto.user;

import lombok.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class UserDto {
    private String username;
    private String name;
    private String email;
    private String password;
}
