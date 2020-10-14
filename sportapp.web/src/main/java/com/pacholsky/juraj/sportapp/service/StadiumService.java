package com.pacholsky.juraj.sportapp.service;

import com.pacholsky.juraj.sportapp.entity.Stadium;
import com.pacholsky.juraj.sportapp.repository.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("stadiumService")
@Transactional
public class StadiumService extends AbstractService<Stadium, StadiumRepository>{


    public List<Stadium> getAll(String name) {
        if (name == null) {
            return super.repository.findAll();
        }
        return super.repository.findAllByName(name);
    }

    public Stadium getById(int id) {
        return super.repository.findById(id).orElseThrow();
    }

    public List<Stadium> getByIdCountry(int idCountry) {
        return super.repository.findAllByIdCountry(idCountry);
    }

    public List<Stadium> getYearOfConstructionGreaterThan(int yearOfConstruction) {
        return super.repository.findByYearOfConstructionGreaterThan(yearOfConstruction);
    }
    public List<Stadium> getCapacityGreaterThan(int capacity){
        return super.repository.findByCapacityGreaterThan(capacity);
    }

}
