package com.pacholsky.juraj.sportapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@SequenceGenerator(sequenceName="country_id_seq", initialValue=1, allocationSize=1, name = "country_gen")
@Table(name="country")
@NamedQueries({
        @NamedQuery(name = "Country.getbyisocode", query =  "SELECT c FROM Country c WHERE c.isoCode = :isocode"),
        @NamedQuery(name = "Country.getallcountry", query =  "SELECT c FROM Country c")
}
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="country_gen")
    private int id;
    private String name;
    private String isoCode;


}
