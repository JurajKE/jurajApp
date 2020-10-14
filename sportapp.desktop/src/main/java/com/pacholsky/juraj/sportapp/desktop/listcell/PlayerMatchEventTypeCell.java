package com.pacholsky.juraj.sportapp.desktop.listcell;

import com.pacholsky.juraj.sportapp.desktop.dto.PlayerDetailView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class PlayerMatchEventTypeCell extends AbstractCell<PlayerDetailView> {

    @FXML
    private Text date;

    @FXML
    private Text goalsHome;

    @FXML
    private Text goalsAway;

    @FXML
    private Text teamAway;

    @FXML
    private HBox matchEventTypeId;

    @FXML
    private ListView<String> listViewMatchEventType;

    //TODO presun format do nejakej Utility class
    SimpleDateFormat format = new SimpleDateFormat("dd.MM.");


    @FXML
    private Text teamHome;

    public PlayerMatchEventTypeCell() {
        super("player_matcheventtype.fxml");
    }

    @Override
    protected void updateSpecific(PlayerDetailView playerDetailView) {
        this.date.setText(format.format(playerDetailView.getDate()));
        this.teamHome.setText(playerDetailView.getTeamHome());
        this.teamAway.setText(playerDetailView.getTeamAway());
        this.goalsHome.setText(playerDetailView.getGoalsHome());
        this.goalsAway.setText(playerDetailView.getGoalsAway());

        for (String pictureFolder : playerDetailView.getMatchEventType() ) {
            ImageView imageView = new ImageView(pictureFolder);
            imageView.setFitWidth(15);
            imageView.setFitHeight(15);
            matchEventTypeId.getChildren().add(imageView);
        }
    }

}
