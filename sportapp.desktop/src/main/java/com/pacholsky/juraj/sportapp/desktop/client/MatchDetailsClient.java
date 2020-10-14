package com.pacholsky.juraj.sportapp.desktop.client;

import com.pacholsky.juraj.sportapp.desktop.constants.UrlConstants;
import com.pacholsky.juraj.sportapp.desktop.dto.server.MatchDetails;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;


public class MatchDetailsClient extends AbstractClient<MatchDetails>{

    public MatchDetailsClient() {
        super("/matchdetails/");

    }

    @Override
    protected Class<MatchDetails> getGenericClass() {
        return MatchDetails.class;
    }
}
