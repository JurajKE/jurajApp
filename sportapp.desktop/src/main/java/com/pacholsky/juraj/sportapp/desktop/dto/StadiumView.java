package com.pacholsky.juraj.sportapp.desktop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StadiumView {

    private int capacity;
    private String name;
    private String country;

}
