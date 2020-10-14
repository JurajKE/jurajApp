package com.pacholsky.juraj.sportapp.controller;

import com.pacholsky.juraj.sportapp.entity.Team;
import com.pacholsky.juraj.sportapp.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping
    public List<Team> getAll(@RequestParam(value = "name" , required = false) String name){
        return teamService.getAll(name);
    }

    @GetMapping("/{id}")
    public Team getById(@PathVariable("id") int id){
    return teamService.getById(id);
    }

    @GetMapping("/stadium/{idstadium}")
    public List<Team> getByIdStadium(@PathVariable("idstadium") int idStadium){
        return teamService.getByIdStadium(idStadium);
    }

    @GetMapping("/year")
    public List<Team> getByFoundationYear(@RequestParam("foundationyear") int foundationYear){
        return teamService.getByFoundationYearGreatenThan(foundationYear);
    }

}
