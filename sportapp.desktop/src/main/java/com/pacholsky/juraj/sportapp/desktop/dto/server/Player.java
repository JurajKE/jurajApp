package com.pacholsky.juraj.sportapp.desktop.dto.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    private String firstName;
    private String surname;
    private String nickname;
    private Date birthday;
    private int idTeam;
    private int idCountry;
    private int id;

}
