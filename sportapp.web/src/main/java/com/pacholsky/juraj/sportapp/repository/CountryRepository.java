package com.pacholsky.juraj.sportapp.repository;

import com.pacholsky.juraj.sportapp.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("countryRepository")
public interface CountryRepository extends JpaRepository<Country, Integer> {

    Country findByIsoCodeEquals(String iso);
    List<Country> findByName(String name);
}
