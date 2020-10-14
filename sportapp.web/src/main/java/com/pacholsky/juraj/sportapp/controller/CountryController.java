package com.pacholsky.juraj.sportapp.controller;

import com.pacholsky.juraj.sportapp.entity.Country;
import com.pacholsky.juraj.sportapp.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getAll(@RequestParam(value = "name" , required = false) String name){
        return countryService.getAll(name);
    }

    @GetMapping("/{id}")
    public Country getById(@PathVariable("id") int id){
        return countryService.getById(id);
    }

    @GetMapping("/isocode/{iso}")
    public Country getByIso(@PathVariable("iso") String iso){
        return countryService.getByIso(iso);
    }

    @PutMapping
    public ResponseEntity<String> save(@RequestBody Country country){
        countryService.save(country);
        return ResponseEntity.ok("saved");
    }



}
