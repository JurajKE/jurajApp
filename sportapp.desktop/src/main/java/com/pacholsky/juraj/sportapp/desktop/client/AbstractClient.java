package com.pacholsky.juraj.sportapp.desktop.client;

import com.pacholsky.juraj.sportapp.desktop.constants.SportsContants;
import com.pacholsky.juraj.sportapp.desktop.constants.UrlConstants;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Coach;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.ConnectException;
import java.time.LocalDate;
import java.util.List;

public abstract class AbstractClient<T>{

    protected WebClient webClient;

    public AbstractClient(String string) {
        this.webClient = WebClient.create(UrlConstants.URL + string);
    }

    public List<T> getAll(){
        return webClient.get()
                .exchange()
                .block()
                .bodyToFlux(getGenericClass())
                .collectList()
                .block();
    }

    public T getById(int id){
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("{id}")
                        .build(id))
                .exchange()
                .block()
                .bodyToMono(getGenericClass())
                .block();
    }

    public List<T> getByDate(LocalDate localDate){
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("date")
                        .queryParam("matchdate" , localDate)
                        .build())
                .exchange()
                .block()
                .bodyToFlux(getGenericClass())
                .collectList()
                .block();
    }

    public List<T> getByTeam(int idTeam){
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("idteam")
                        .queryParam("idteam" , idTeam)
                        .build())
                .exchange()
                .block()
                .bodyToFlux(getGenericClass())
                .collectList()
                .block();
    }

    public List<T> getByIdMatch(int id , int matcheventtype){
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("matchid")
                        .queryParam("matchid" , id)
                        .queryParam("matcheventtypeid" , matcheventtype)
                        .build())
                .exchange()
                .block()
                .bodyToFlux(getGenericClass())
                .collectList()
                .block();
    }

    public List<T> getByIdPlayer(int id){
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("playerid")
                        .queryParam("playerid" , id)
                        .build())
                .exchange()
                .block()
                .bodyToFlux(getGenericClass())
                .collectList()
                .block();
    }

    public List<T> getByIdMatchAndIdPlayer(int idMatch , int idPlayer){
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("playeridandidmatch")
                        .queryParam("playerid" , idPlayer)
                        .queryParam("matchid" , idMatch)
                        .build())
                .exchange()
                .block()
                .bodyToFlux(getGenericClass())
                .collectList()
                .block();
    }

    protected abstract Class<T> getGenericClass();
}
