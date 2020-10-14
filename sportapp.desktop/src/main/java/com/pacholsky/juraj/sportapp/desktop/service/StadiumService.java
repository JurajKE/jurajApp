package com.pacholsky.juraj.sportapp.desktop.service;

import com.pacholsky.juraj.sportapp.desktop.client.StadiumClient;
import com.pacholsky.juraj.sportapp.desktop.dto.StadiumView;
import com.pacholsky.juraj.sportapp.desktop.modelmapper.StadiumListViewModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class StadiumService {

    private StadiumClient stadiumClient = new StadiumClient();
    private StadiumListViewModelMapper stadiumListViewModelMapper = new StadiumListViewModelMapper();

    public List<StadiumView> getAll(){
        return stadiumClient.getAll().stream()
                .map(stadium -> stadiumListViewModelMapper.map(stadium, StadiumView.class))
                .collect(Collectors.toList());
    }



}
