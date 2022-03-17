package com.codedecode.microservices.CitizenService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "citizen")
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer citizenId;

//    @Column(name="name")
    @Column
    private String name;

//    @Column(name="vaccination_center_id")
    @Column
    private int vaccinationCenterId;




}
