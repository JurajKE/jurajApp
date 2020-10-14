package com.pacholsky.juraj.sportapp.service;

import com.pacholsky.juraj.sportapp.entity.Coach;
import com.pacholsky.juraj.sportapp.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("coachService")
@Transactional
public class CoachService extends AbstractService<Coach, CoachRepository> {

    public List<Coach> getAll(String name){
        if (name == null){
            return super.repository.findAll();
        }
        return super.repository.findAllBySurname(name);
    }

    public List<Coach> getByFirstName(String firstName){
        return super.repository.findAllByFirstName(firstName);
    }

    public List<Coach> getByIdTeam(int idTeam){
        return super.repository.findAllByIdTeam(idTeam);
    }

    public List<Coach> getByIdCountry(int idCountry){
        return super.repository.findAllByIdCountry(idCountry);
    }

    public Coach getById(int id){
        return super.repository.findById(id).orElseThrow();
    }

    public void save(Coach coach){
       super.repository.saveAndFlush(coach);
    }
}

