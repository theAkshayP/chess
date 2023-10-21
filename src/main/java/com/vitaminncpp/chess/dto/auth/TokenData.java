package com.vitaminncpp.chess.dto.auth;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@ToString
public class TokenData {
    String accessToken;
    String refreshToken;
    String username;
}
