package com.pacholsky.juraj.sportapp.repository;

import com.pacholsky.juraj.sportapp.entity.MatchDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.List;

@Repository("matchDetailsRepository")
public interface MatchDetailsRepository extends JpaRepository<MatchDetails, Integer> {

     List<MatchDetails> findAllByIdMatch(int idMatch);
     List<MatchDetails> findByIdPlayer(int idPlayer);
     List<MatchDetails> findByIdMatchEventType(int idMatchEventType);
     List<MatchDetails> findByDetailTimeAfter(Time time);
     List<MatchDetails> findByIdMatchAndIdMatchEventType(int idMatch, int idMatchEventType);
     List<MatchDetails> findByIdPlayerAndIdMatch(int idPlayer, int idMatch);
}
