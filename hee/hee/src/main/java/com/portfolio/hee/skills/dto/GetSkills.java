package com.portfolio.hee.skills.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GetSkills {

    private Long skill_id;
    private String skill_image;
    private String skill_name;
    private String skill_level;

}
