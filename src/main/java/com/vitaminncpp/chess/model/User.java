package com.vitaminncpp.chess.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = "email"), @UniqueConstraint(columnNames = "username")})
public class User {
    @Id
    @Column(name = "username", nullable = false, unique = true, table = "users")
    private String username;

    @Column(name = "name", nullable = false, table = "users")
    private String name;

    @Column(name = "email", nullable = false, unique = true, table = "users")
    private String email;

    @Column(name = "password", nullable = false, table = "users")
    private String password;

}
