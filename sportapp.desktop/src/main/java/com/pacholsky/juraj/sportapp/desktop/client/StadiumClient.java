package com.pacholsky.juraj.sportapp.desktop.client;

import com.pacholsky.juraj.sportapp.desktop.constants.UrlConstants;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Stadium;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

public class StadiumClient extends AbstractClient<Stadium>{

    public StadiumClient() {
        super("/stadium/");

    }

    @Override
    protected Class<Stadium> getGenericClass() {
        return Stadium.class;
    }
}
