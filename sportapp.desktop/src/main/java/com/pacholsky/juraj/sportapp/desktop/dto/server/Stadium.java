package com.pacholsky.juraj.sportapp.desktop.dto.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stadium {

    private int capacity;
    private int yearOfConstruction;
    private int id;
    private String name;
    private int idCountry;

}
