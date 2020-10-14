package com.pacholsky.juraj.sportapp.desktop.service;

import com.pacholsky.juraj.sportapp.desktop.client.MatchClient;
import com.pacholsky.juraj.sportapp.desktop.dto.MatchView;
import com.pacholsky.juraj.sportapp.desktop.modelmapper.MatchViewModelMapper;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class MatchService {

    private MatchClient matchClient = new MatchClient();
    private MatchViewModelMapper matchViewModelMapper = new MatchViewModelMapper();

    public List<MatchView> getByDate(LocalDate localDate){
        return matchClient.getByDate(localDate).stream()
                .map(match -> matchViewModelMapper.map(match, MatchView.class))
                .collect(Collectors.toList());
    }

}
