package com.pacholsky.juraj.sportapp.controller;

import com.pacholsky.juraj.sportapp.entity.Player;
import com.pacholsky.juraj.sportapp.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping
    public List<Player> getAll (@RequestParam(value = "name" , required = false) String name){
        return playerService.getAll(name);
    }

    @GetMapping("/surname")
    public List<Player> getBySurname (@RequestParam("surname") String surname){
        return playerService.getBySurname(surname);
    }

    @GetMapping("/{id}")
    public Player getById(@PathVariable("id") int id){
        return playerService.getById(id);
    }


    @GetMapping("/idbetween")
    public List<Player> getByIdBetween(@RequestParam(value = "idFrom" , required = false) int startId , @RequestParam(value = "idTo", required = false) int endId){
        return playerService.getByIdBetween(startId, endId);
    }

    @GetMapping("/idteam")
    public List<Player> getByIdTeam (@RequestParam("idteam") int idTeam){
        return playerService.getByIdTeam(idTeam);
    }

    @GetMapping("/name")
    public List<Player> getByFirstNameStartingWith(@RequestParam("name") String name){
        return playerService.getByFirstNameStartingWith(name);
    }

    @GetMapping("/sur")
    public List<Player> getBySurnameStartingWith(@RequestParam("sur") String surname){
        return playerService.getBySurnameStartingWith(surname);
    }



    @GetMapping("/idcountry")
    public List<Player> getByIdCountry (@RequestParam("idcountry") int idCountry){
        return playerService.getByIdCountry(idCountry);
    }


}
