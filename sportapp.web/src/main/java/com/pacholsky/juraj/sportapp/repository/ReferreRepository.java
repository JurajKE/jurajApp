package com.pacholsky.juraj.sportapp.repository;

import com.pacholsky.juraj.sportapp.entity.Referre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository("referreRepository")
public interface ReferreRepository extends JpaRepository<Referre, Integer> {

    List<Referre> findByFirstName(String firstName);
    List<Referre> findBySurname(String surname);
    List<Referre> findByBirthdayAfter(Date date);
    List<Referre> findByIdCountry(int idCountry);
}
