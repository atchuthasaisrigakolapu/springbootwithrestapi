package com.example.restfullservice.controller;

import com.example.restfullservice.model.Ticket;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketRestController {

   // @GetMapping(value="/ticket/{ticketId}",produces = {"application/json","application/xml"})
    @GetMapping(value="/ticket/{ticketId}")
    public ResponseEntity<Ticket> getTicket(@PathVariable("ticketId") String ticketId){
        Ticket ticket = new Ticket();
        ticket.setTicketId(101);
        ticket.setFrom("austr");
        ticket.setTo("india");
        ticket.setTrainNumber(123456);
        ticket.setPrice(100d);
        ticket.setJourneyDate("22042022");
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }

}
