package com.pacholsky.juraj.sportapp.repository;

import com.pacholsky.juraj.sportapp.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("teamRepository")
public interface TeamRepository extends JpaRepository<Team, Integer> {

    List<Team> findByName(String name);
    List<Team> findByIdStadium(int idStadium);
    List<Team> findByFoundationYearGreaterThan(int foundationYear);

}
