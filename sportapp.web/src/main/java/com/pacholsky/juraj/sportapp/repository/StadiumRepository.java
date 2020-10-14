package com.pacholsky.juraj.sportapp.repository;

import com.pacholsky.juraj.sportapp.entity.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("stadiumRepository")
public interface StadiumRepository extends JpaRepository<Stadium, Integer> {

    List<Stadium> findAllByName(String name);
    List<Stadium> findByCapacityGreaterThan(int id);
    List<Stadium> findAllByIdCountry(int idCountry);
    List<Stadium> findByYearOfConstructionGreaterThan(int yearOfConstruction);
}
