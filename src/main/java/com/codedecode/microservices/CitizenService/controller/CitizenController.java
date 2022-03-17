package com.codedecode.microservices.CitizenService.controller;

import com.codedecode.microservices.CitizenService.entity.Citizen;
import com.codedecode.microservices.CitizenService.repository.CitizenRepo;
import com.google.common.util.concurrent.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

@Autowired
    private CitizenRepo repo;

// skiping the business logic layer of the service class or layer for now
//@Autowired
//    public CitizenController(Service service) {
//        this.service = service;
//    }


    @RequestMapping( path = "/test")
    public ResponseEntity <String> test(){

        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

    // getting data form darabase
    @GetMapping("/id/{id}")
    public ResponseEntity<List<Citizen>> getById(@PathVariable Integer id){

    List<Citizen> liistCitizen = repo.findByVaccinationCenterId(id);

        return new ResponseEntity(liistCitizen, HttpStatus.OK);
    }

    @PostMapping (path = "/add")
    public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen){

        Citizen addedCitizen = repo.save(newCitizen);

        return new ResponseEntity(addedCitizen, HttpStatus.OK);
    }
}


