package com.pacholsky.juraj.sportapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@SequenceGenerator(sequenceName="player_id_seq", initialValue=1, allocationSize=1, name = "player_gen")
@Table(name="player")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    private String firstName;
    private String surname;
    private String nickname;
    private Date birthday;
    private int idTeam;
    private int idCountry;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="player_gen")
    private int id;


}
