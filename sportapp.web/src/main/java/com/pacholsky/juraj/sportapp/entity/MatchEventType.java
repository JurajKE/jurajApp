package com.pacholsky.juraj.sportapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@SequenceGenerator(sequenceName="match_event_type_id_seq", initialValue=1, allocationSize=1, name = "match_event_type_gen")
@Table(name="match_event_type")
@NamedQuery(name = "MatchEventType.getall", query =  "SELECT m FROM MatchEventType m")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchEventType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="match_event_type_gen")
    private int id;
    private String type;
    private String folderPicture;


}
