package com.pacholsky.juraj.sportapp.desktop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchDetailsView {

    private String firstName;
    private String surname;
    private LocalTime time;
    private String pictureFolder;



}
