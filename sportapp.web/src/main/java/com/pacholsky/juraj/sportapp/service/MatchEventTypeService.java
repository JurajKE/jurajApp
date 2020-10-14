package com.pacholsky.juraj.sportapp.service;

import com.pacholsky.juraj.sportapp.entity.MatchEventType;
import com.pacholsky.juraj.sportapp.repository.MatchEventTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("matchEventTypeService")
@Transactional
public class MatchEventTypeService extends AbstractService<MatchEventType, MatchEventTypeRepository>{


    public List<MatchEventType> getAll(String type){
        if (type == null){
            return super.repository.findAll();
        }return super.repository.findByTypeEquals(type);

    }

    public MatchEventType getById(int id){
        return super.repository.findById(id).orElseThrow();
    }

    public void save (MatchEventType matchEventType){
        super.repository.saveAndFlush(matchEventType);
    }
}
