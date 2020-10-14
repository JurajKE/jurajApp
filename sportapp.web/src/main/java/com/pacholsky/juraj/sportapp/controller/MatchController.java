package com.pacholsky.juraj.sportapp.controller;

import com.pacholsky.juraj.sportapp.entity.Match;
import com.pacholsky.juraj.sportapp.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping
    public List<Match> getAll(){
        return matchService.getAll();
    }

    @GetMapping("/{id}")
    public Match getById(@PathVariable("id") int id){
        return matchService.getById(id);
    }

    @GetMapping("/attendence")
    public List<Match> getByAttendence(@RequestParam("attendance") int attendance){
        return matchService.getByAttendence(attendance);
    }

    @GetMapping("/idteam")
    public List<Match> getByIdTeam(@RequestParam("idteam") int idTeam){
        return matchService.getByIdTeam(idTeam);
    }

    @GetMapping("/date")
    public List<Match> getByMatchDate(@RequestParam("matchdate")Date date){
        return matchService.getByMatchDate(date);
    }

    @GetMapping("/time")
    public List<Match> getByMatchTime(@RequestParam("matchtime")Time time){
        return matchService.getByMatchTime(time);
    }

    @GetMapping("/stadium/{idstadium}")
    public List<Match> getByIdStadium(@PathVariable("idstadium") int idStadium){
        return matchService.getByIdStadium(idStadium);
    }




}
