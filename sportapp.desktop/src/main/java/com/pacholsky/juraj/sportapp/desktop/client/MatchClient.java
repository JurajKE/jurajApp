package com.pacholsky.juraj.sportapp.desktop.client;

import com.pacholsky.juraj.sportapp.desktop.constants.UrlConstants;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Match;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.LocalDate;
import java.util.List;


public class MatchClient extends AbstractClient<Match>{

    public MatchClient() {
        super("/match/");

    }

    @Override
    protected Class<Match> getGenericClass() {
        return Match.class;
    }
}
