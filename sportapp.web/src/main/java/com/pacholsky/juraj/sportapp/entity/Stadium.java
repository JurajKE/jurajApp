package com.pacholsky.juraj.sportapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@SequenceGenerator(sequenceName="stadium_id_seq", initialValue=1, allocationSize=1, name = "stadium_gen")
@Table(name="stadium")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stadium {

    private int capacity;
    private int yearOfConstruction;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="stadium_gen")
    private int id;
    private String name;
    private int idCountry;



}
