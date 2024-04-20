package com.portfolio.hee.skills.service;

import com.portfolio.hee.skills.entity.Skills;
import com.portfolio.hee.skills.repository.SkillRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService{

    private final SkillRepository repository;

    @Override
    public List<Skills> getSkill() {
        return repository.findAll();
    }
}

