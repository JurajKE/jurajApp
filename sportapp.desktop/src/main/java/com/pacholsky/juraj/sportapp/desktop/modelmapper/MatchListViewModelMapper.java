package com.pacholsky.juraj.sportapp.desktop.modelmapper;

import com.pacholsky.juraj.sportapp.desktop.client.MatchDetailsClient;
import com.pacholsky.juraj.sportapp.desktop.client.MatchEventTypeClient;
import com.pacholsky.juraj.sportapp.desktop.client.PlayerClient;
import com.pacholsky.juraj.sportapp.desktop.dto.MatchDetailsView;
import com.pacholsky.juraj.sportapp.desktop.dto.server.MatchDetails;
import com.pacholsky.juraj.sportapp.desktop.dto.server.Player;
import org.modelmapper.ModelMapper;

public class MatchListViewModelMapper extends ModelMapper {

    private PlayerClient playerClient = new PlayerClient();
    private MatchEventTypeClient matchEventTypeClient = new MatchEventTypeClient();
    private MatchDetailsClient matchDetailsClient = new MatchDetailsClient();

    public MatchListViewModelMapper() {
        this.createTypeMap(MatchDetails.class , MatchDetailsView.class)
                .setPostConverter(converter -> {
                    MatchDetails matchDetails = converter.getSource();
                    MatchDetailsView matchDetailsView= converter.getDestination();

                    Player player = playerClient.getById(matchDetails.getIdPlayer());
                    matchDetailsView.setFirstName(player.getFirstName());
                    matchDetailsView.setSurname(player.getSurname());
                    matchDetailsView.setPictureFolder(matchEventTypeClient.getById(matchDetails.getIdMatchEventType()).getFolderPicture());
                    matchDetailsView.setTime(matchDetails.getDetailTime().toLocalTime());
                    return matchDetailsView;
                });
    }


}
