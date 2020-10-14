package com.pacholsky.juraj.sportapp.controller;

import com.pacholsky.juraj.sportapp.entity.Stadium;
import com.pacholsky.juraj.sportapp.service.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stadium")
public class StadiumController {


    @Autowired
    private StadiumService stadiumService;

    @GetMapping
    public List<Stadium> gelAll(@RequestParam(value = "name" , required = false) String name){
        return stadiumService.getAll(name);
    }

    @GetMapping("/{id}")
    public Stadium getById(@PathVariable("id") int id){
        return stadiumService.getById(id);
    }

    @GetMapping("/capacity")
    public List<Stadium> getCapacityGreaterThan(@RequestParam ("capacity") int capacity){
        return stadiumService.getCapacityGreaterThan(capacity);
    }

    @GetMapping("/country/{idcountry}")
    public List<Stadium> getByIdCountry(@PathVariable("idcountry") int idCountry){
        return stadiumService.getByIdCountry(idCountry);
    }

    @GetMapping("/year")
    public List<Stadium> getByYearOfConstruction(@RequestParam(value = "yearofconstruction") int yearOfConstruction){
        return stadiumService.getYearOfConstructionGreaterThan(yearOfConstruction);
    }

    @PutMapping
    public ResponseEntity<String> save (@RequestBody Stadium stadium){
        return null;
    }

}
