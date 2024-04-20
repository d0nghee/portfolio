package com.portfolio.hee.skills.repository;

import com.portfolio.hee.skills.dto.GetSkills;
import com.portfolio.hee.skills.entity.Skills;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Mapper
public interface SkillRepository extends JpaRepository<Skills, Long> {
    List<Skills> findAll();
}
