package com.pacholsky.juraj.sportapp.desktop.listcell;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;

import java.io.IOException;

public abstract class AbstractCell<T> extends ListCell<T> {

    public AbstractCell(String string) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource(string));
            loader.setController(this);
            setGraphic(loader.load());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void updateItem(T object , boolean empty) {
        super.updateItem(object, empty);
        if(empty || object == null) {
            setText(null);
            setContentDisplay(ContentDisplay.TEXT_ONLY);
        } else {
            updateSpecific(object);
            this.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        }
    }

    protected abstract void updateSpecific(T object);

}
