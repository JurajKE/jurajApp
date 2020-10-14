package com.pacholsky.juraj.sportapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@SequenceGenerator(sequenceName="referre_id_seq", initialValue=1, allocationSize=1, name = "referee_gen")
@Table(name="referre")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Referre {

    private String firstName;
    private String surname;
    private Date birthday;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="referee_gen")
    private int id;
    private int idCountry;


}
