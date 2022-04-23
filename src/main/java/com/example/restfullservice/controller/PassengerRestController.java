package com.example.restfullservice.controller;

import com.example.restfullservice.model.Passenger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassengerRestController {

    @PostMapping(value="/ticket",consumes = {"application/json","application/xml"})
    public ResponseEntity<String> bookTicket(@RequestBody Passenger passenger){
        System.out.println(passenger);
        return new ResponseEntity<>("Ticket Booked", HttpStatus.CREATED);
    }
    @PostMapping(value="/bookPassengerTicket",consumes = {"application/json"} ,produces ={"application/json","application/xml"})
    public ResponseEntity<Passenger> bookPassengerTicket(@RequestBody Passenger passenger) {
        return new ResponseEntity<>(passenger, HttpStatus.CREATED);
    }

}
