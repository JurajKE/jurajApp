package com.pacholsky.juraj.sportapp.desktop.service;

import com.pacholsky.juraj.sportapp.desktop.client.MatchClient;
import com.pacholsky.juraj.sportapp.desktop.client.MatchDetailsClient;
import com.pacholsky.juraj.sportapp.desktop.client.PlayerClient;
import com.pacholsky.juraj.sportapp.desktop.dto.MatchDetailsView;
import com.pacholsky.juraj.sportapp.desktop.dto.PlayerDetailView;
import com.pacholsky.juraj.sportapp.desktop.modelmapper.MatchListViewModelMapper;
import com.pacholsky.juraj.sportapp.desktop.modelmapper.PlayerDetailViewModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class MatchDetailsService {

    private MatchDetailsClient matchDetailsClient = new MatchDetailsClient();
    private MatchListViewModelMapper matchListViewModelMapper = new MatchListViewModelMapper();
    private MatchClient matchClient = new MatchClient();
    private PlayerClient playerClient = new PlayerClient();
    private PlayerDetailViewModelMapper playerDetailViewModelMapper = new PlayerDetailViewModelMapper();


    public List<MatchDetailsView> getByIdMatch(int id , int matchEventType){
        return matchDetailsClient.getByIdMatch(id , matchEventType).stream()
                .map(matchDetails -> matchListViewModelMapper.map(matchDetails, MatchDetailsView.class))
                .collect(Collectors.toList());

    }

    public List<MatchDetailsView> getByIdPlayer(int id){
        return matchDetailsClient.getByIdPlayer(id).stream()
                .map(matchDetails -> matchListViewModelMapper.map(matchDetails, MatchDetailsView.class))
                .collect(Collectors.toList());

    }

    public List<PlayerDetailView> getDetailsByIdPlayer(int id){
        int idTeam = playerClient.getById(id).getIdTeam();
       return matchClient.getByTeam(idTeam).stream().map(match -> playerDetailViewModelMapper.mapToPlayerDetailView(id, match)).collect(Collectors.toList());
    }






}
