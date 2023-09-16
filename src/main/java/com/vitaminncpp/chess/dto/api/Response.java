package com.vitaminncpp.chess.dto.api;

import lombok.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Response {
    private int status;
    private boolean success;
    private boolean error;
    private String message;
    private Object data;
}
