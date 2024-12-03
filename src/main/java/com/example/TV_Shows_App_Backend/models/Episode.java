package com.example.TV_Shows_App_Backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table(name = "episodes")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int season;
    private int episode;
    private String name;


    @Temporal(TemporalType.TIMESTAMP)
    private Date airDate;

    @ManyToOne
    @JoinColumn(name = "tv_show_id")
    private TvShow tvShow;

}
