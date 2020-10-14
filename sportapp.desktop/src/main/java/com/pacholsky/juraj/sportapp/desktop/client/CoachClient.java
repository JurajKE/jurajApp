package com.pacholsky.juraj.sportapp.desktop.client;

import com.pacholsky.juraj.sportapp.desktop.constants.UrlConstants;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Coach;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Country;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

public class CoachClient extends AbstractClient<Coach>{

    public CoachClient() {
        super("/coach/");

    }

    @Override
    protected Class<Coach> getGenericClass() {
        return Coach.class;
    }

}
