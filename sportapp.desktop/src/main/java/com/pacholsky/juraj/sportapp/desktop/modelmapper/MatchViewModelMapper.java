package com.pacholsky.juraj.sportapp.desktop.modelmapper;

import com.pacholsky.juraj.sportapp.desktop.client.TeamClient;
import com.pacholsky.juraj.sportapp.desktop.dto.MatchView;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Match;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Team;
import org.modelmapper.ModelMapper;

public class MatchViewModelMapper extends ModelMapper {

    private TeamClient teamClient = new TeamClient();

    public MatchViewModelMapper() {
        this.createTypeMap(Match.class , MatchView.class)
                .setPostConverter(converter -> {
                    Match match = converter.getSource();
                    MatchView matchView = converter.getDestination();

                    Team teamAway = teamClient.getById(match.getIdTeamAway());
                    Team teamHome = teamClient.getById(match.getIdTeamHome());

                    matchView.setNameAwayTeam(teamAway.getName());
                    matchView.setNameHomeTeam(teamHome.getName());
                    matchView.setPictureFolderHomeTeam(teamHome.getPictureFolder());
                    matchView.setPictureFolderAwayTeam(teamAway.getPictureFolder());
                    return matchView;
                });
    }
}
