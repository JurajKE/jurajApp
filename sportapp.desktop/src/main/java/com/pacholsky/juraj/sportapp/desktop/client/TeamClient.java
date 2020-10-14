package com.pacholsky.juraj.sportapp.desktop.client;

import com.pacholsky.juraj.sportapp.desktop.constants.UrlConstants;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Team;
import org.springframework.web.reactive.function.client.WebClient;

public class TeamClient extends AbstractClient<Team>{
    public TeamClient() {
        super("/team/");
    }

    @Override
    protected Class<Team> getGenericClass() {
        return Team.class;
    }

}
