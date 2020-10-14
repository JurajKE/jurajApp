package com.pacholsky.juraj.sportapp.service;

import com.pacholsky.juraj.sportapp.entity.Match;
import com.pacholsky.juraj.sportapp.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Service("matchService")
@Transactional
public class MatchService extends AbstractService<Match, MatchRepository>{



    public List<Match> getAll(){
            return super.repository.findAll();
    }


    public Match getById(int id){
        return super.repository.findById(id).orElseThrow();
    }

    public List<Match> getByAttendence(int attendance){
        return super.repository.findByAttendanceGreaterThan(attendance);
    }

    public List<Match> getByIdTeam(int idTeam){
        return super.repository.findByIdTeamHomeOrIdTeamAway(idTeam, idTeam);
    }

    public List<Match> getByMatchDate(Date date){
        return super.repository.findByMatchDate(date);
    }

    public List<Match> getByMatchTime(Time time){
        return super.repository.findByMatchTimeAfter(time);
    }

    public List<Match> getByIdStadium(int idStadium){
        return super.repository.findByIdStadium(idStadium);
    }

}
