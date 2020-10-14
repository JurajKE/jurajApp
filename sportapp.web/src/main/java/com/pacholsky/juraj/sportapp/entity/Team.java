package com.pacholsky.juraj.sportapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@SequenceGenerator(sequenceName="team_id_seq", initialValue=1, allocationSize=1, name = "team_gen")
@Table(name="team")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    private int foundationYear;
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="team_gen")
    private int id;
    private int idStadium;
    private String pictureFolder;


}
