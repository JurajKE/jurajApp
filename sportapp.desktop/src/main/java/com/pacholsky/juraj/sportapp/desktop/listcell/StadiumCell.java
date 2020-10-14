package com.pacholsky.juraj.sportapp.desktop.listcell;

import com.pacholsky.juraj.sportapp.desktop.dto.StadiumView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;
import javafx.scene.text.Text;

import java.io.IOException;

public class StadiumCell extends AbstractCell<StadiumView>{

    @FXML
    private Text country;

    @FXML
    private Text name;

    @FXML
    private Text attendence;

    public StadiumCell() {
        super("stadium_list_view.fxml");
    }

    @Override
    protected void updateSpecific(StadiumView stadiumView) {
        this.name.setText(stadiumView.getName());
        this.country.setText(stadiumView.getCountry());
        this.attendence.setText(String.valueOf(stadiumView.getCapacity()));
    }
}
