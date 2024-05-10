package com.portfolio.hee.skills.controller;

import com.portfolio.hee.skills.entity.Skills;
import com.portfolio.hee.skills.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class SkillController {

    private final SkillService service;

    @GetMapping("/skill")
    public ResponseEntity<Skills> getPost() {
        return new ResponseEntity(service.getSkill(), HttpStatus.OK);
    }

}
