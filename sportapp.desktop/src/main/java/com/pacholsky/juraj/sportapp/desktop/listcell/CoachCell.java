package com.pacholsky.juraj.sportapp.desktop.listcell;

import com.pacholsky.juraj.sportapp.desktop.dto.CoachView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;
import javafx.scene.text.Text;

import java.io.IOException;

public class CoachCell extends AbstractCell<CoachView> {

    public CoachCell() {
        super("player_or_coach_list_view.fxml");

    }

    @FXML
    private Text country;

    @FXML
    private Text surname;

    @FXML
    private Text name;

    @FXML
    private Text team;

    @Override
    protected void updateSpecific(CoachView coachView) {
        this.name.setText(coachView.getFirstName());
        this.surname.setText(coachView.getSurname());
        this.team.setText(coachView.getTeam());
        this.country.setText(coachView.getCountry());
    }

}
