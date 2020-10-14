package com.pacholsky.juraj.sportapp.desktop;

import com.pacholsky.juraj.sportapp.desktop.controllers.MatchDetailController;
import com.pacholsky.juraj.sportapp.desktop.controllers.PlayerDetailController;
import com.pacholsky.juraj.sportapp.desktop.controllers.SummaryController;
import com.pacholsky.juraj.sportapp.desktop.dto.CoachView;
import com.pacholsky.juraj.sportapp.desktop.dto.MatchView;
import com.pacholsky.juraj.sportapp.desktop.dto.PlayerView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application implements ScreenCallback{

    private Stage matchDetailStage;
    private MatchDetailController matchDetailController;
    private Stage playerDetailStage;
    private PlayerDetailController playerDetailController;


    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader summaryLoader = new FXMLLoader(getClass().getClassLoader().getResource("summary.fxml"));
        Parent summaryRoot = summaryLoader.load();
        stage.setTitle("Sport App");
        stage.setScene(new Scene(summaryRoot));
        SummaryController summaryController = summaryLoader.getController();
        summaryController.setScreenCallback(this);
        stage.show();

        matchDetailStage = new Stage();
        FXMLLoader matchDetailLoader = new FXMLLoader(getClass().getClassLoader().getResource("match_detail.fxml"));
        Parent matchDetailRoot = matchDetailLoader.load();
        this.matchDetailStage.setTitle("Sport App");
        this.matchDetailStage.setScene(new Scene(matchDetailRoot));
        this.matchDetailController = matchDetailLoader.getController();
        this.matchDetailController.setScreenCallback(this);

        playerDetailStage = new Stage();
        FXMLLoader playerDetailLoader = new FXMLLoader(getClass().getClassLoader().getResource("player_detail.fxml"));
        Parent playerDetailRoot = playerDetailLoader.load();
        this.playerDetailStage.setTitle("Sport App");
        this.playerDetailStage.setScene(new Scene(playerDetailRoot));
        this.playerDetailController = playerDetailLoader.getController();
        this.playerDetailController.setScreenCallback(this);
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void showMatchDetail(MatchView matchView) {
        matchDetailController.refreshDetailsForView(matchView);
        matchDetailStage.show();
    }



    @Override
    public void showPlayerDetail(PlayerView playerView) {
       playerDetailController.refreshPlayerDetail(playerView);
       playerDetailStage.show();
    }

    @Override
    public void showCoachDetail(CoachView coachView) {
        playerDetailController.refreshCoachDetail(coachView);
        playerDetailStage.show();
    }


}
