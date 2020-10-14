package com.pacholsky.juraj.sportapp.repository;

import com.pacholsky.juraj.sportapp.entity.MatchEventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("matchEventTypeRepository")
public interface MatchEventTypeRepository extends JpaRepository <MatchEventType, Integer>{

    List<MatchEventType> findByTypeEquals(String type);
}
