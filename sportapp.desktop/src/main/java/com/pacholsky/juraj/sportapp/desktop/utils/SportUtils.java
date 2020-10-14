package com.pacholsky.juraj.sportapp.desktop.utils;

import java.time.LocalTime;

public final class SportUtils {
    private SportUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String localTimesToMinutes(LocalTime localTime){
       int time = localTime.getHour() * 60 + localTime.getMinute();
       return String.format("%d'", time);
    }



}
