package com.portfolio.hee.board.controller;

import com.portfolio.hee.board.entity.Projects;
import com.portfolio.hee.board.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BoardController {

    private final PostService service;

    @GetMapping("/main")
    public ResponseEntity<Projects> getPost() {
        return new ResponseEntity(service.getPost(), HttpStatus.OK);
    }

}
