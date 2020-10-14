package com.pacholsky.juraj.sportapp.desktop.dto.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchDetails {

    private Time detailTime;
    private int id;
    private int idMatch;
    private int idPlayer;
    private int idMatchEventType;


}
