package com.vitaminncpp.chess.dto.auth;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@ToString
public class LoginInfoDto {
    String username;
    String password;
}
