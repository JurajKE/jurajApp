package com.pacholsky.juraj.sportapp.service;

import com.pacholsky.juraj.sportapp.entity.Player;
import com.pacholsky.juraj.sportapp.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("playerService")
@Transactional
public class PlayerService extends AbstractService<Player, PlayerRepository>{



    public List<Player> getAll(String name){
        if (name == null) {
            return super.repository.findAll();
        }
        return super.repository.findAllByFirstName(name);
    }

    public List<Player> getBySurname(String surname){
        return super.repository.findAllBySurname(surname);
    }


    public Player getById(int id){
        return super.repository.findById(id).orElseThrow();
    }

    public List<Player> getByIdBetween(int startId, int endId){
        return super.repository.findByIdBetween(startId, endId);
    }

    public List<Player>getByFirstNameStartingWith(String name){
        return super.repository.findByFirstNameStartingWith(name);
    }

    public List<Player>getBySurnameStartingWith(String surname){
        return super.repository.findBySurnameStartingWith(surname);
    }




    public List<Player> getByIdTeam(int id){
        return super.repository.findAllByIdTeam(id);
    }

    public List<Player> getByIdCountry(int id){
        return super.repository.findAllByIdCountry(id);
    }


}
