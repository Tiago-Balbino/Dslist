package com.devsuperior.dslist.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "game")
@EqualsAndHashCode
public class Game {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column(name = "game_year")
    private Integer year;

    @Column
    private String genre;

    @Column
    private String platforms;

    @Column
    private Double score;

    @Column
    private String imgUrl;

    @Column
    private String shortDescription;

    @Column
    private String longDescription;
}
