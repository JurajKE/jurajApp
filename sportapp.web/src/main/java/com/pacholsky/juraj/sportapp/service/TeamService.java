package com.pacholsky.juraj.sportapp.service;

import com.pacholsky.juraj.sportapp.entity.Team;
import com.pacholsky.juraj.sportapp.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("teamService")
@Transactional
public class TeamService extends AbstractService<Team, TeamRepository>{


    public List<Team> getAll(String name){
        if (name == null){
            return super.repository.findAll();
        }return super.repository.findByName(name);
    }

    public Team getById(int id){
        return super.repository.findById(id).orElseThrow();
    }

    public List<Team> getByIdStadium(int idStadium){
        return super.repository.findByIdStadium(idStadium);
    }

    public List<Team> getByFoundationYearGreatenThan(int foundationYear){
        return super.repository.findByFoundationYearGreaterThan(foundationYear);
    }

}
