package com.pacholsky.juraj.sportapp.desktop.dto.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    private int foundationYear;
    private String name;
    private int id;
    private int idStadium;
    private String pictureFolder;

}
