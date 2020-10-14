package com.pacholsky.juraj.sportapp.desktop.client;

import com.pacholsky.juraj.sportapp.desktop.constants.UrlConstants;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Player;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

public class PlayerClient extends AbstractClient<Player>{


    public PlayerClient() {
        super("/player/");

    }

    @Override
    protected Class<Player> getGenericClass() {
        return Player.class;
    }
}