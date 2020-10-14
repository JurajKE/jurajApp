package com.pacholsky.juraj.sportapp.controller;


import com.pacholsky.juraj.sportapp.entity.Referre;
import com.pacholsky.juraj.sportapp.service.ReferreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/referre")
public class ReferreController {


    @Autowired
    private ReferreService referreService;

    @GetMapping
    public List<Referre> getAll(@RequestParam(value = "firstname" , required = false) String firstName){
        return referreService.getAll(firstName);
    }

    @GetMapping("/{id}")
    public Referre getById(@PathVariable("id") int id){
        return referreService.getById(id);
    }

    @GetMapping("/surname/{surname}")
    public List<Referre> getBySurname(@PathVariable("surname") String surname){
        return referreService.getBySurname(surname);
    }

    @GetMapping("/date")
    public List<Referre> getByStartDateAfter(@RequestParam("date") Date date){
        return referreService.getByStartDateAfter(date);
    }

    @GetMapping("/country/{idcountry}")
    public List<Referre> getByIdCountry(@PathVariable("idcountry") int idCountry){
        return referreService.getByIdCountry(idCountry);
    }



}
