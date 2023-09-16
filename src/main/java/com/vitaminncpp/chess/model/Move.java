package com.vitaminncpp.chess.model;

import com.vitaminncpp.chess.model.enums.ChessPiece;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;


@Data
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "moves", uniqueConstraints = @UniqueConstraint(columnNames = "move_id"))
public class Move {
    @Id
    @Column(name = "move_id", unique = true, nullable = false, table = "moves")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long moveId;

    @ManyToOne(targetEntity = Game.class)
    @JoinColumn(name = "game_id", referencedColumnName = "game_id", nullable = false)
    private Game game;

    @Column(name = "name", table = "moves", nullable = false)
    private String name;

    @Column(name = "src_x", nullable = false, table = "moves")
    private int srcX;

    @Column(name = "src_y", nullable = false, table = "moves")
    private int srcY;
    @Column(name = "dest_x", nullable = false, table = "moves")
    private int destX;
    @Column(name = "dest_y", nullable = false, table = "moves")
    private int destY;

    @Column(name = "turn", nullable = false, table = "moves")
    private boolean turn;
    @Column(name = "piece", nullable = false, table = "moves")
    private ChessPiece piece;
    @Column(name = "start_time", nullable = false, table = "moves")
    private Instant startTime;
    @Column(name = "end_time", nullable = false, table = "moves")
    private ChessPiece endTime;
    @Column(name = "duration", nullable = false, table = "moves")
    private long duration;
}