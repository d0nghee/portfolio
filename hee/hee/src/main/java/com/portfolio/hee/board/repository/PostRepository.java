package com.portfolio.hee.board.repository;

import com.portfolio.hee.board.dto.response.GetProject;
import com.portfolio.hee.board.entity.Projects;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Mapper
public interface PostRepository extends JpaRepository<Projects, Long> {
    List<Projects> findAll();

}
