package com.pacholsky.juraj.sportapp.desktop.listcell;

import com.pacholsky.juraj.sportapp.desktop.dto.PlayerView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;
import javafx.scene.text.Text;

import java.io.IOException;

public class PlayerCell extends AbstractCell<PlayerView> {

    @FXML
    private Text country;

    @FXML
    private Text surname;

    @FXML
    private Text name;

    @FXML
    private Text team;

    public PlayerCell() {
        super("player_or_coach_list_view.fxml");
    }


    @Override
    protected void updateSpecific(PlayerView playerView) {
        this.name.setText(playerView.getFirstName());
        this.surname.setText(playerView.getSurname());
        this.team.setText(playerView.getTeam());
        this.country.setText(playerView.getCountry());
    }
}
