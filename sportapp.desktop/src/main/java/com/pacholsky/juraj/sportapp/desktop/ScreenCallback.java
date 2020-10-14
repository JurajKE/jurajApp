package com.pacholsky.juraj.sportapp.desktop;

import com.pacholsky.juraj.sportapp.desktop.dto.CoachView;
import com.pacholsky.juraj.sportapp.desktop.dto.MatchView;
import com.pacholsky.juraj.sportapp.desktop.dto.PlayerView;

public interface ScreenCallback {

    void showMatchDetail(MatchView matchView);
    void showPlayerDetail(PlayerView playerView);
    void showCoachDetail(CoachView coachView);
}
