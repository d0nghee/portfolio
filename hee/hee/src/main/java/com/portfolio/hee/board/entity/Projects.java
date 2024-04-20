package com.portfolio.hee.board.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long projectId;

    @Column
    private String project_image;

    @Column
    private String project_title;

    @Column
    private String project_intro;

    @Column
    private LocalDateTime project_term;



}
