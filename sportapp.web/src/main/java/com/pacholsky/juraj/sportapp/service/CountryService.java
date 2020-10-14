package com.pacholsky.juraj.sportapp.service;

import com.pacholsky.juraj.sportapp.entity.Country;
import com.pacholsky.juraj.sportapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("countryService")
@Transactional
public class CountryService extends AbstractService<Country, CountryRepository> {


    public List<Country> getAll(String name){
        if (name == null){
            return super.repository.findAll();
        }
        return super.repository.findByName(name);
                //entityManager.createNamedQuery("Country.getallcountry", Country.class).getResultList();
    }


    public Country getById(int id){
        return super.repository.findById(id).orElseThrow();
                //entityManager.find(Country.class, id);
    }

    public Country getByIso(String iso){
        return super.repository.findByIsoCodeEquals(iso);

                //this.entityManager.createNamedQuery("Country.getbyisocode", Country.class).setParameter("isocode", iso.toUpperCase()).getSingleResult();
    }

    public void save(Country country){
        super.repository.saveAndFlush(country);
    }


}
