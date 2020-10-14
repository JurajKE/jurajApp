package com.pacholsky.juraj.sportapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

@Entity
@SequenceGenerator(sequenceName="match_details_id_seq", initialValue=1, allocationSize=1, name = "match_details_gen")
@Table(name="match_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchDetails {

    private Time detailTime;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="match_details_gen")
    private int id;
    private int idMatch;
    private int idPlayer;
    private int idMatchEventType;



}
