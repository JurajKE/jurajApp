package com.pacholsky.juraj.sportapp.repository;

import com.pacholsky.juraj.sportapp.entity.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("coachRepository")
public interface CoachRepository extends JpaRepository<Coach, Integer> {

    List<Coach> findAllBySurname(String surname);
    List<Coach> findAllByFirstName(String firstName);
    List<Coach> findAllByIdTeam(int idTeam);
    List<Coach> findAllByIdCountry(int idTeam);
}
