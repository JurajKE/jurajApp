package com.pacholsky.juraj.sportapp.controller;


import com.pacholsky.juraj.sportapp.entity.MatchEventType;
import com.pacholsky.juraj.sportapp.service.MatchEventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matcheventtype")
public class MatchEventTypeController {

    @Autowired
    private MatchEventTypeService matchEventTypeService;

    @GetMapping
    public List<MatchEventType> getAll(@RequestParam(value = "type" , required = false) String type){
        return matchEventTypeService.getAll(type);
    }

    @GetMapping("/{id}")
    public MatchEventType getById(@PathVariable("id") int id){
        return matchEventTypeService.getById(id);
    }

    @PutMapping
    public ResponseEntity<String> save (@RequestBody MatchEventType matchEventType){
        matchEventTypeService.save(matchEventType);
        return ResponseEntity.ok("saved");
    }



}
