package com.pacholsky.juraj.sportapp.service;

import com.pacholsky.juraj.sportapp.entity.MatchDetails;
import com.pacholsky.juraj.sportapp.repository.MatchDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Time;
import java.util.List;

@Service("matchDetailsService")
@Transactional

public class MatchDetailsService extends AbstractService<MatchDetails, MatchDetailsRepository>{


    public List<MatchDetails> getAll(){
        return super.repository.findAll();
    }

    public MatchDetails getById(int id){
        return super.repository.findById(id).orElseThrow();
    }

    public List<MatchDetails> getByIdMatch(int idMatch){
        return super.repository.findAllByIdMatch(idMatch);
    }

    public List<MatchDetails> findByIdMatchAndIdMatchEventType(int idMatch , int matchEventTypeId){
        return super.repository.findByIdMatchAndIdMatchEventType(idMatch, matchEventTypeId);
    }

    public List<MatchDetails> findByIdPlayerAndIdMatchEventType(int idPlayer){
        return super.repository.findByIdPlayer(idPlayer);
    }

    public List<MatchDetails> getByIdPlayerAndIdMatch(int idPlayer , int idMatch){
        return super.repository.findByIdPlayerAndIdMatch(idPlayer , idMatch);
    }

    public List<MatchDetails> getByIdPlayer(int idPlayer){
        return super.repository.findByIdPlayer(idPlayer);
    }


    public List<MatchDetails> getByIdMatchEventType(int idMatchEventType){
        return super.repository.findByIdMatchEventType(idMatchEventType);
    }

    public List<MatchDetails> getByTimeAfter(Time time){
        return super.repository.findByDetailTimeAfter(time);
    }

}
