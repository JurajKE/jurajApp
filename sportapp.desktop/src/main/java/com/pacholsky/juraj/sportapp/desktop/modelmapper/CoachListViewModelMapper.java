package com.pacholsky.juraj.sportapp.desktop.modelmapper;

import com.pacholsky.juraj.sportapp.desktop.client.CountryClient;
import com.pacholsky.juraj.sportapp.desktop.client.TeamClient;
import com.pacholsky.juraj.sportapp.desktop.dto.CoachView;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Coach;
import org.modelmapper.ModelMapper;

public class CoachListViewModelMapper extends ModelMapper {

    private TeamClient teamClient = new TeamClient();
    private CountryClient countryClient = new CountryClient();


    public CoachListViewModelMapper() {
        this.createTypeMap(Coach.class , CoachView.class)
                .setPostConverter(converter -> {
                    Coach coach = converter.getSource();
                    CoachView coachView = converter.getDestination();
                    coachView.setTeam(teamClient.getById(coach.getIdTeam()).getName());
                    coachView.setCountry(countryClient.getById(coach.getIdCountry()).getName());
                    return coachView;
                });
    }

}
