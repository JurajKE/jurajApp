package com.pacholsky.juraj.sportapp.desktop.service;

import com.pacholsky.juraj.sportapp.desktop.client.PlayerClient;
import com.pacholsky.juraj.sportapp.desktop.dto.PlayerView;
import com.pacholsky.juraj.sportapp.desktop.modelmapper.PlayerViewModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class PlayersService {

    private PlayerClient playerClient = new PlayerClient();
    private PlayerViewModelMapper playerViewModelMapper = new PlayerViewModelMapper();

    public List<PlayerView> getAll(){
        return playerClient.getAll().stream()
                .map(player -> playerViewModelMapper.map(player, PlayerView.class))
                .collect(Collectors.toList());
    }




}
