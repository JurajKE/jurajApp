package com.pacholsky.juraj.sportapp.desktop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoachView {

    private String firstName;
    private String surname;
    private String team;
    private String country;

}
