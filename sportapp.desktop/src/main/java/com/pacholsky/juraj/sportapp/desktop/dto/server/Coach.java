package com.pacholsky.juraj.sportapp.desktop.dto.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coach {

    private String firstName;
    private String surname;
    private Integer id;
    private Date birthday;
    private int idTeam;
    private int idCountry;


}
