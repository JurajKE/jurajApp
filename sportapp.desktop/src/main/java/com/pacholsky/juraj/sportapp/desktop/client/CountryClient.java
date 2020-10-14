package com.pacholsky.juraj.sportapp.desktop.client;

import com.pacholsky.juraj.sportapp.desktop.constants.UrlConstants;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Country;
import org.springframework.web.reactive.function.client.WebClient;

public class CountryClient extends AbstractClient<Country>{

    public CountryClient() {
        super("/country/");

    }


    @Override
    protected Class<Country> getGenericClass() {
        return Country.class;
    }
}
