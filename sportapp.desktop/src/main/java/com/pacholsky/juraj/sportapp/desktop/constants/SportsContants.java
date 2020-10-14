package com.pacholsky.juraj.sportapp.desktop.constants;

import java.time.format.DateTimeFormatter;

public class SportsContants {

    private SportsContants(){
        throw new IllegalStateException("Utility class");
    }


    public static final int GOALS_ID = 3;
    public static final int YELLOW_ID = 1;
    public static final int RED_ID = 2;

    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM. EEE");

}
