package com.pacholsky.juraj.sportapp.desktop.client;

import com.pacholsky.juraj.sportapp.desktop.constants.UrlConstants;
import com.pacholsky.juraj.sportapp.desktop.dto.server.MatchEventType;
import org.springframework.web.reactive.function.client.WebClient;

public class MatchEventTypeClient extends AbstractClient<MatchEventType> {

    public MatchEventTypeClient() {
        super("/matcheventtype/");

    }

    @Override
    protected Class<MatchEventType> getGenericClass() {
        return MatchEventType.class;
    }
}
