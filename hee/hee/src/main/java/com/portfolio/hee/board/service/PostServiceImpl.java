package com.portfolio.hee.board.service;

import com.portfolio.hee.board.entity.Projects;
import com.portfolio.hee.board.repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;


    @Override
    public List<Projects> getPost() {
        return postRepository.findAll();
    }
}
