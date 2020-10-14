package com.pacholsky.juraj.sportapp.repository;

import com.pacholsky.juraj.sportapp.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("playerRepository")
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    List<Player> findAllByFirstName(String name);
    List<Player> findAllBySurname(String surname);
    List<Player> findByIdBetween(int startId, int endId);
    List<Player> findAllByIdTeam(int idTeam);
    List<Player> findAllByIdCountry(int idCountry);
    List<Player> findByFirstNameStartingWith(String name);
    List<Player> findBySurnameStartingWith(String surname);
}
