package com.pacholsky.juraj.sportapp.desktop.controllers;

import com.pacholsky.juraj.sportapp.desktop.ScreenCallback;
import javafx.fxml.Initializable;
import lombok.Getter;
import lombok.Setter;

public abstract class AbstractController implements Initializable {

    @Setter
    @Getter
    private ScreenCallback screenCallback;
}
