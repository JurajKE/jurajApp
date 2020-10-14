package com.pacholsky.juraj.sportapp.controller;

import com.pacholsky.juraj.sportapp.entity.Coach;
import com.pacholsky.juraj.sportapp.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coach")
public class CoachController {

    @Autowired
    private CoachService coachService;

    @GetMapping
    public List<Coach> getAll(@RequestParam(value = "surname" , required = false) String name){
       return coachService.getAll(name);
    }

    @GetMapping("/firstname")
    public List<Coach> getByfirstName(@RequestParam("firstname") String firstName){
        return coachService.getByFirstName(firstName);
    }

    @GetMapping("/{id}")
    public Coach getById(@PathVariable("id") int id){ return coachService.getById(id);
    }



    @GetMapping("/idteams")
    public List<Coach> getByIdTeam(@RequestParam("idteam") int idTeam){
        return coachService.getByIdTeam(idTeam);
    }

    @GetMapping("/idcountry")
    public List<Coach> getByIdCountry(@RequestParam("idcountry") int idCountry){
        return coachService.getByIdCountry(idCountry);
    }

    @PutMapping
    public ResponseEntity<String> save (@RequestBody Coach coach){
        coachService.save(coach);
        return ResponseEntity.ok("saved");
    }
}
