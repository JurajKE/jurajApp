package com.pacholsky.juraj.sportapp.desktop.modelmapper;

import com.pacholsky.juraj.sportapp.desktop.client.MatchDetailsClient;
import com.pacholsky.juraj.sportapp.desktop.client.MatchEventTypeClient;
import com.pacholsky.juraj.sportapp.desktop.client.TeamClient;
import com.pacholsky.juraj.sportapp.desktop.dto.PlayerDetailView;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Match;
import com.pacholsky.juraj.sportapp.desktop.dto.server.MatchEventType;
import org.modelmapper.ModelMapper;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerDetailViewModelMapper extends ModelMapper {

    private MatchDetailsClient matchDetailsClient = new MatchDetailsClient();
    private TeamClient teamClient = new TeamClient();
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM."); //
    private MatchEventTypeClient matchEventTypeClient = new MatchEventTypeClient();

    public PlayerDetailView mapToPlayerDetailView(int playerId , Match match){
        PlayerDetailView playerDetailView = this.map(match , PlayerDetailView.class);

        List<String> url = matchDetailsClient.getByIdMatchAndIdPlayer(match.getId() , playerId).stream()
                .map(matchDetails -> matchEventTypeClient.getById(matchDetails.getIdMatchEventType()))
                .map(MatchEventType::getFolderPicture).collect(Collectors.toList());

        playerDetailView.setMatchEventType(url);
        return playerDetailView;

    }

    public PlayerDetailViewModelMapper() {
        this.createTypeMap(Match.class , PlayerDetailView.class)
                .setPostConverter(converter -> {
                    Match match = converter.getSource();
                    PlayerDetailView playerDetailView= converter.getDestination();
                    playerDetailView.setDate(match.getMatchDate()); //.format(dateTimeFormatter)
                    playerDetailView.setGoalsHome(String.valueOf(match.getGoalsHome()));
                    playerDetailView.setGoalsAway(String.valueOf(match.getGoalsAway()));
                    playerDetailView.setTeamHome(teamClient.getById(match.getIdTeamHome()).getName());
                    playerDetailView.setTeamAway(teamClient.getById(match.getIdTeamAway()).getName());

                    return playerDetailView;
                });
}


}
