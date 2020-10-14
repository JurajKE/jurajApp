package com.pacholsky.juraj.sportapp.repository;

import com.pacholsky.juraj.sportapp.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.sql.Time;
import java.util.List;

@Repository("matchRepository")
public interface MatchRepository extends JpaRepository<Match, Integer> {

    List<Match> findByAttendanceGreaterThan(int attendence);
    List<Match> findByMatchDate(Date date);
    List<Match> findByMatchTimeAfter(Time time);
    List<Match> findByIdStadium(int idStadium);
    List<Match> findByIdTeamHomeOrIdTeamAway(int idTeamAway , int idTeamHome);
}
