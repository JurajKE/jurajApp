package com.pacholsky.juraj.sportapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@SequenceGenerator(sequenceName ="coach_id_seq", initialValue=1, allocationSize=1, name = "coach_gen")
@Table(name="coach")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coach {

    private String firstName;
    private String surname;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="coach_gen")
    private Integer id;
    private Date birthday;
    private int idTeam;
    private int idCountry;



}
