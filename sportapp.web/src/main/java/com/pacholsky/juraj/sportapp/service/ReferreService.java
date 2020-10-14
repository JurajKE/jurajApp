package com.pacholsky.juraj.sportapp.service;

import com.pacholsky.juraj.sportapp.entity.Referre;
import com.pacholsky.juraj.sportapp.repository.ReferreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

@Service("referreService")
@Transactional

public class ReferreService extends AbstractService<Referre, ReferreRepository>{


    public List<Referre> getAll(String firstName){
        if (firstName == null){
            return super.repository.findAll();
        }return super.repository.findByFirstName(firstName);
    }

    public Referre getById(int id){
        return super.repository.findById(id).orElseThrow();
    }

    public List<Referre> getBySurname(String surname){
        return super.repository.findBySurname(surname);
    }

    public List<Referre> getByStartDateAfter(Date date){
        return super.repository.findByBirthdayAfter(date);
    }

    public List<Referre> getByIdCountry(int idCountry){
        return super.repository.findByIdCountry(idCountry);
    }


}
