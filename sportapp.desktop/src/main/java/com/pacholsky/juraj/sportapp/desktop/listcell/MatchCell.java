package com.pacholsky.juraj.sportapp.desktop.listcell;

import com.pacholsky.juraj.sportapp.desktop.dto.MatchView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;
import javafx.scene.text.Text;

import java.io.IOException;

public class MatchCell extends AbstractCell<MatchView> {

    @FXML
    private Text nameHome;

    @FXML
    private Text nameAway;

    @FXML
    private Text goalsHome;

    @FXML
    private Text goalsAway;

    public MatchCell() {
        super("match_list_view.fxml");
    }


    @Override
    protected void updateSpecific(MatchView matchView) {
        this.nameHome.setText(matchView.getNameHomeTeam());
        this.nameAway.setText(matchView.getNameAwayTeam());
        this.goalsHome.setText(String.valueOf(matchView.getGoalsHome()));
        this.goalsAway.setText(String.valueOf(matchView.getGoalsAway()));
    }

}
