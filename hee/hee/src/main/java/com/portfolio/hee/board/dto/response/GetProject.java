package com.portfolio.hee.board.dto.response;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class GetProject {

    private Long project_id;

    private String project_image;

    private String project_title;

    private String project_intro;

    private LocalDateTime project_term;

}
