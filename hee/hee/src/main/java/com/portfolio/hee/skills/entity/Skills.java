package com.portfolio.hee.skills.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;

    @Column
    private String skill_image;

    @Column
    private String skill_name;

    @Column
    private String skill_level;
}
