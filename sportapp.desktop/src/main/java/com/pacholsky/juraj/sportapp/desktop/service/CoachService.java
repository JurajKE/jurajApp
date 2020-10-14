package com.pacholsky.juraj.sportapp.desktop.service;

import com.pacholsky.juraj.sportapp.desktop.client.CoachClient;
import com.pacholsky.juraj.sportapp.desktop.dto.CoachView;
import com.pacholsky.juraj.sportapp.desktop.modelmapper.CoachListViewModelMapper;

import java.util.List;
import java.util.stream.Collectors;


public class CoachService {

    private CoachClient coachClient = new CoachClient();
    private CoachListViewModelMapper coachListViewModelMapper = new CoachListViewModelMapper();

    public List<CoachView> getAll(){
        return coachClient.getAll().stream()
                .map(coach -> coachListViewModelMapper.map(coach, CoachView.class))
                .collect(Collectors.toList());
    }

}
