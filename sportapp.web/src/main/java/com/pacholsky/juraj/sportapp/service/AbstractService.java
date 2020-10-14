package com.pacholsky.juraj.sportapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public abstract class AbstractService<R, T extends JpaRepository<R, Integer>> {

    protected T repository;

    @Autowired
    protected void setRepository(T repository){
        this.repository = repository;
    }

    public List<R> getAll(){
        return repository.findAll();
    }

    public R getById(int id){
        return repository.findById(id).orElseThrow();
    }

}
