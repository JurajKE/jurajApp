package com.pacholsky.juraj.sportapp.desktop.controllers;

import com.pacholsky.juraj.sportapp.desktop.constants.SportsContants;
import com.pacholsky.juraj.sportapp.desktop.dto.MatchDetailsView;
import com.pacholsky.juraj.sportapp.desktop.dto.MatchView;
import com.pacholsky.juraj.sportapp.desktop.listcell.MatchDetailCell;
import com.pacholsky.juraj.sportapp.desktop.service.MatchDetailsService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MatchDetailController extends AbstractController {

    @FXML
    private ListView<MatchDetailsView> listViewYellowCards;
    @FXML
    private ListView<MatchDetailsView> listViewRedCards;
    @FXML
    private ListView<MatchDetailsView> listViewGoals;

    @FXML
    private Text teamHome;
    @FXML
    private Text score;
    @FXML
    private Text teamAway;
    @FXML
    private ImageView badgeAway;
    @FXML
    private ImageView badgeHome;

    private MatchDetailsService matchDetailsService = new MatchDetailsService();

    public void refreshDetailsForView(MatchView matchView){

        try {
            URL homeTeamBadgeResource = getClass().getClassLoader().getResource(matchView.getPictureFolderHomeTeam());
            if (homeTeamBadgeResource != null) {
                badgeHome.setImage(new Image(homeTeamBadgeResource.openStream()));
            } else {
                System.out.println("nespravny link");
            }

            URL awayTeamBadgeResource = getClass().getClassLoader().getResource(matchView.getPictureFolderAwayTeam());
            if (awayTeamBadgeResource != null){
                badgeAway.setImage(new Image(awayTeamBadgeResource.openStream()));
            } else{
                System.out.println("nespravny link");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        teamHome.setText(matchView.getNameHomeTeam());
        teamAway.setText(matchView.getNameAwayTeam());
        score.setText(matchView.getGoalsHome() + " - " + matchView.getGoalsAway());

        listViewGoals.getItems().clear();
        ObservableList<MatchDetailsView> goals = FXCollections.observableArrayList(matchDetailsService.getByIdMatch(matchView.getId(), SportsContants.GOALS_ID));
        listViewGoals.setItems(goals);

        listViewYellowCards.getItems().clear();
        ObservableList<MatchDetailsView> yellowCards = FXCollections.observableArrayList(matchDetailsService.getByIdMatch(matchView.getId() , SportsContants.YELLOW_ID));
        listViewYellowCards.setItems(yellowCards);

        listViewRedCards.getItems().clear();
        ObservableList<MatchDetailsView> redCards = FXCollections.observableArrayList(matchDetailsService.getByIdMatch(matchView.getId() , SportsContants.RED_ID));
        listViewRedCards.setItems(redCards);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listViewGoals.setCellFactory(matchDetailsViewListView -> new MatchDetailCell());
        listViewYellowCards.setCellFactory(matchDetailsViewListView -> new MatchDetailCell());
        listViewRedCards.setCellFactory(matchDetailsViewListView -> new MatchDetailCell());
    }
}
