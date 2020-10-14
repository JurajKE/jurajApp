package com.pacholsky.juraj.sportapp.desktop.listcell;

import com.pacholsky.juraj.sportapp.desktop.dto.MatchDetailsView;
import com.pacholsky.juraj.sportapp.desktop.utils.SportUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class MatchDetailCell extends AbstractCell<MatchDetailsView> {

    @FXML
    private Text firstName;

    @FXML
    private Text surname;

    @FXML
    private Text time;

    @FXML
    private ImageView match_details_goal_or;

    public MatchDetailCell() {
        super("match_details_list_view.fxml");
    }

    @Override
    protected void updateSpecific(MatchDetailsView matchDetailsview) {
        this.firstName.setText(matchDetailsview.getFirstName());
        this.surname.setText(matchDetailsview.getSurname());
        this.time.setText(SportUtils.localTimesToMinutes(matchDetailsview.getTime()));
        try {
            URL pictureFolder = getClass().getClassLoader().getResource(matchDetailsview.getPictureFolder());
            if (pictureFolder != null){
                this.match_details_goal_or.setImage(new Image(pictureFolder.openStream()));
            } else {
                System.out.println("nespravny link");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
