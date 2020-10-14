package com.pacholsky.juraj.sportapp.desktop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDetailView {

    public int id;
    private Date date;
    private String teamHome;
    private String teamAway;
    private List<String> matchEventType;
    private String goalsHome;
    private String goalsAway;



}
