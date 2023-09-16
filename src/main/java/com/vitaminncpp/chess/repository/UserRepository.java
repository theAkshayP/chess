package com.vitaminncpp.chess.repository;

import com.vitaminncpp.chess.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {
}
