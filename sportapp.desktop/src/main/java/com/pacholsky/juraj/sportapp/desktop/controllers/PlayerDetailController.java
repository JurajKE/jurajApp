package com.pacholsky.juraj.sportapp.desktop.controllers;

import com.pacholsky.juraj.sportapp.desktop.dto.CoachView;
import com.pacholsky.juraj.sportapp.desktop.dto.MatchDetailsView;
import com.pacholsky.juraj.sportapp.desktop.dto.PlayerDetailView;
import com.pacholsky.juraj.sportapp.desktop.dto.PlayerView;
import com.pacholsky.juraj.sportapp.desktop.listcell.PlayerMatchEventTypeCell;
import com.pacholsky.juraj.sportapp.desktop.service.MatchDetailsService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class PlayerDetailController extends AbstractController {

    @FXML
    private Text surname;

    @FXML
    private Text name;

    @FXML
    private Text team;

    @FXML
    private ListView<PlayerDetailView> listViewGoals;

    private MatchDetailsService matchDetailsService = new MatchDetailsService();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listViewGoals.setCellFactory(playerDetailViewListView -> new PlayerMatchEventTypeCell());
    }


    public void refreshPlayerDetail(PlayerView playerView){
        name.setText(playerView.getFirstName());
        surname.setText(playerView.getSurname());
        team.setText(playerView.getTeam());

        listViewGoals.getItems().clear();
        ObservableList<PlayerDetailView> goals2 = FXCollections.observableArrayList(matchDetailsService.getDetailsByIdPlayer(playerView.getIdPlayer()));
        listViewGoals.setItems(goals2);
    }

    public void refreshCoachDetail(CoachView coachView){
        name.setText(coachView.getFirstName());
        surname.setText(coachView.getSurname());
        team.setText(coachView.getTeam());
    }
}
