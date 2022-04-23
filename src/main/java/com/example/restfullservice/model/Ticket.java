package com.example.restfullservice.model;


import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
//@XmlRootElement
public class Ticket {

    private Integer ticketId;
    private String from;
    private String to;
    private Double price;
    private String journeyDate;
    private Integer trainNumber;
}
