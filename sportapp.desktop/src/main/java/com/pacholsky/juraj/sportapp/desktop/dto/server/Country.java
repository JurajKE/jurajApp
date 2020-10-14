package com.pacholsky.juraj.sportapp.desktop.dto.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    private int id;
    private String name;
    private String isoCode;


}
