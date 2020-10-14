package com.pacholsky.juraj.sportapp.desktop.controllers;

import com.pacholsky.juraj.sportapp.desktop.constants.SportsContants;
import com.pacholsky.juraj.sportapp.desktop.dto.CoachView;
import com.pacholsky.juraj.sportapp.desktop.dto.MatchView;
import com.pacholsky.juraj.sportapp.desktop.dto.PlayerView;
import com.pacholsky.juraj.sportapp.desktop.dto.StadiumView;
import com.pacholsky.juraj.sportapp.desktop.listcell.CoachCell;
import com.pacholsky.juraj.sportapp.desktop.listcell.MatchCell;
import com.pacholsky.juraj.sportapp.desktop.listcell.PlayerCell;
import com.pacholsky.juraj.sportapp.desktop.listcell.StadiumCell;
import com.pacholsky.juraj.sportapp.desktop.service.CoachService;
import com.pacholsky.juraj.sportapp.desktop.service.MatchService;
import com.pacholsky.juraj.sportapp.desktop.service.PlayersService;
import com.pacholsky.juraj.sportapp.desktop.service.StadiumService;
import com.pacholsky.juraj.sportapp.desktop.utils.SportUtils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;


public class SummaryController extends AbstractController {

    @FXML
    private ListView<MatchView> listViewMatches;
    @FXML
    private Button buttonPreviousDay;
    @FXML
    private ListView<PlayerView> listViewPlayers;
    @FXML
    private ListView<StadiumView> listViewStadiums;
    @FXML
    private ListView<CoachView> listViewCoach;
    @FXML
    private Button buttonNextDay;
    @FXML
    private Text dateText;
    @FXML
    private TextField filterPlayerName;
    @FXML
    private TextField filterSurname;
    @FXML
    private Button filterAll;
    private List<PlayerView> playerSave;
    private LocalDate localDate = LocalDate.of(2020, 6, 16);

    private MatchService matchService = new MatchService();
    private PlayersService playersService = new PlayersService();
    private StadiumService stadiumService = new StadiumService();
    private CoachService coachService = new CoachService();

    private void refreshMatches(){
        listViewMatches.getItems().clear();
        ObservableList<MatchView> matches = FXCollections.observableArrayList(matchService.getByDate(localDate));
        listViewMatches.setItems(matches);

        String formattedString = localDate.format(SportsContants.FORMATTER);
        dateText.setText(formattedString);
    }

    private void refreshPlayerListView(){
        listViewPlayers.getItems().clear();
        playerSave = playersService.getAll();
        listViewPlayers.setItems(FXCollections.observableArrayList(playerSave));
    }

    private void refreshStadiumListView(){
        listViewStadiums.getItems().clear();
        ObservableList<StadiumView> stadiums = FXCollections.observableArrayList(stadiumService.getAll());
        listViewStadiums.setItems(stadiums);
    }

    private void refreshCoachListView(){
        listViewCoach.getItems().clear();
        ObservableList<CoachView> coach = FXCollections.observableArrayList(coachService.getAll());
        listViewCoach.setItems(coach);
    }

    private void refreshFilterByFirstNamePlayer(){
        List<PlayerView> playerList = playerSave.stream().filter(playerView -> playerView.getFirstName().contains(filterPlayerName.getText())).collect(Collectors.toList());
        listViewPlayers.setItems(FXCollections.observableArrayList(playerList));
    }

    private void refreshFilterBySurnamePlayer(){
        List<PlayerView> playerListSurname = playerSave.stream().filter(playerView -> playerView.getSurname().contains(filterSurname.getText())).collect(Collectors.toList());
        listViewPlayers.setItems(FXCollections.observableArrayList(playerListSurname));
    }

    private void refreshFilterAllPlayer(){
        listViewCoach.getItems().clear();
        listViewPlayers.setItems(FXCollections.observableArrayList(playerSave));
    }

    private void refreshDayNext(){
        localDate = localDate.plusDays(1);
        refreshMatches();
    }

    public void refreshDayPrevious(){
        localDate = localDate.minusDays(1);
        refreshMatches();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listViewMatches.setCellFactory(matchViewListView -> new MatchCell());
        listViewPlayers.setCellFactory(playerViewListView -> new PlayerCell());
        listViewStadiums.setCellFactory(stadiumViewListView -> new StadiumCell());
        listViewCoach.setCellFactory(coachViewListView -> new CoachCell());

        refreshMatches();
        refreshPlayerListView();
        refreshStadiumListView();
        refreshCoachListView();

        filterPlayerName.setOnAction(actionEvent -> refreshFilterByFirstNamePlayer());
        filterSurname.setOnAction(actionEvent -> refreshFilterBySurnamePlayer());
        filterAll.setOnMouseClicked(mouseEvent -> refreshFilterAllPlayer());
        buttonNextDay.setOnMouseClicked(mouseEvent -> refreshDayNext());
        buttonPreviousDay.setOnMouseClicked(mouseEvent -> refreshDayPrevious());


        listViewMatches.setOnMouseClicked(mouseEvent -> getScreenCallback().showMatchDetail(listViewMatches.getSelectionModel().getSelectedItem()));
        listViewPlayers.setOnMouseClicked(mouseEvent -> getScreenCallback().showPlayerDetail(listViewPlayers.getSelectionModel().getSelectedItem()));
        listViewCoach.setOnMouseClicked(mouseEvent -> getScreenCallback().showCoachDetail(listViewCoach.getSelectionModel().getSelectedItem()));
    }
}
