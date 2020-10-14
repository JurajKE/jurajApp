package com.pacholsky.juraj.sportapp.desktop.modelmapper;

import com.pacholsky.juraj.sportapp.desktop.client.CountryClient;
import com.pacholsky.juraj.sportapp.desktop.client.TeamClient;
import com.pacholsky.juraj.sportapp.desktop.dto.PlayerView;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Player;
import org.modelmapper.ModelMapper;

public class PlayerViewModelMapper extends ModelMapper {

    private TeamClient teamClient = new TeamClient();
    private CountryClient countryClient = new CountryClient();


    public PlayerViewModelMapper() {
        this.createTypeMap(Player.class , PlayerView.class)
                .setPostConverter(converter -> {
                    Player players = converter.getSource();
                    PlayerView playerView = converter.getDestination();
                    playerView.setTeam(teamClient.getById(players.getIdTeam()).getName());
                    playerView.setCountry(countryClient.getById(players.getIdCountry()).getName());
                    return playerView;
                });
    }

}
