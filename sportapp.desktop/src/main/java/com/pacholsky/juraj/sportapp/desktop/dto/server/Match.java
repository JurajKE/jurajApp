package com.pacholsky.juraj.sportapp.desktop.dto.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Match {

    private Date matchDate;
    private Time matchTime;
    private int id;
    private int goalsAway;
    private int goalsHome;
    private int attendance;
    private int idStadium;
    private int idTeamHome;
    private int idTeamAway;

}
