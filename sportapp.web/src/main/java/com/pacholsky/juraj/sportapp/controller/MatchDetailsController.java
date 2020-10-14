package com.pacholsky.juraj.sportapp.controller;

import com.pacholsky.juraj.sportapp.entity.MatchDetails;
import com.pacholsky.juraj.sportapp.service.MatchDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.List;

@RestController
@RequestMapping("/matchdetails")
public class MatchDetailsController {

    @Autowired
    private MatchDetailsService matchDetailsService;

    @GetMapping
    public List<MatchDetails> getAll(){
    return matchDetailsService.getAll();
    }

    @GetMapping("/{id}")
    public MatchDetails getById(@PathVariable("id") int id){
        return matchDetailsService.getById(id);
    }

    @GetMapping("/idmatch")
    public List<MatchDetails> getByIdMatch(@RequestParam("idmatch") int idMatch){
        return matchDetailsService.getByIdMatch(idMatch);
    }

    @GetMapping("/matchid")
    public List<MatchDetails> findByIdMatchAndIdMatchEventType(@RequestParam("matchid") int idMatch , @RequestParam("matcheventtypeid") int matchEventTypeId){
        return matchDetailsService.findByIdMatchAndIdMatchEventType(idMatch, matchEventTypeId);
    }

    @GetMapping("/playerid")
    public List<MatchDetails> findByIdPlayerAndIdMatchEventType(@RequestParam("playerid") int idPlayer){
        return matchDetailsService.findByIdPlayerAndIdMatchEventType(idPlayer);
    }

    @GetMapping("/playeridandidmatch")
    public List<MatchDetails> findByIdPlayerAndIdMatch(@RequestParam("playerid") int idPlayer , @RequestParam("matchid") int idMatch){
        return matchDetailsService.getByIdPlayerAndIdMatch(idPlayer , idMatch);
    }

    @GetMapping("/player/{idplayer}")
    public List<MatchDetails> getByIdPlayer(@PathVariable("idplayer") int idPlayer){
        return matchDetailsService.getByIdPlayer(idPlayer);
    }

    @GetMapping("/matcheventtype")
    public List<MatchDetails> getByIdMatchEventType(@RequestParam("idmet") int idMatchEventType){
        return matchDetailsService.getByIdMatchEventType(idMatchEventType);
    }

    @GetMapping("/time")

    public List<MatchDetails> getByTimeAfter(@RequestParam("detailtime") Time time){
        return matchDetailsService.getByTimeAfter(time);
    }




}
