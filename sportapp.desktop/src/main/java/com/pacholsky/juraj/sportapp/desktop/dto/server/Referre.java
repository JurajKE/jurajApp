package com.pacholsky.juraj.sportapp.desktop.dto.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Referre {

    private String firstName;
    private String surname;
    private Date birthday;
    private int id;
    private int idCountry;

}
