package com.pacholsky.juraj.sportapp.desktop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchView {

    private int id;
    private int goalsAway;
    private int goalsHome;
    private String nameHomeTeam;
    private String nameAwayTeam;

    private String pictureFolderHomeTeam;
    private String pictureFolderAwayTeam;




}
