package com.portfolio.hee.board.service;

import com.portfolio.hee.board.entity.Projects;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostService {

    List<Projects> getPost();

}
