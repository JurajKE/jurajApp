package com.pacholsky.juraj.sportapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


@Entity
@SequenceGenerator(sequenceName="match_id_seq", initialValue=1, allocationSize=1, name = "match_gen")
@Table(name="match")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Match {

    private Date matchDate;
    private Time matchTime;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="match_gen")
    private int id;
    private int goalsAway;
    private int goalsHome;
    private int attendance;
    private int idStadium;
    private int idTeamHome;
    private int idTeamAway;





}
