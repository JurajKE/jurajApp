package com.pacholsky.juraj.sportapp.desktop.modelmapper;

import com.pacholsky.juraj.sportapp.desktop.client.CountryClient;
import com.pacholsky.juraj.sportapp.desktop.dto.StadiumView;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Stadium;
import org.modelmapper.ModelMapper;

public class StadiumListViewModelMapper extends ModelMapper {

    private CountryClient countryClient = new CountryClient();

    public StadiumListViewModelMapper() {
        this.createTypeMap(Stadium.class , StadiumView.class)
                .setPostConverter(converter -> {
                    Stadium stadium = converter.getSource();
                    StadiumView stadiumView = converter.getDestination();
                    stadiumView.setCountry(countryClient.getById(stadium.getIdCountry()).getName());
                    return stadiumView;
                });
    }

}
