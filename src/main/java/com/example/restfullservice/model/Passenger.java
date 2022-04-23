package com.example.restfullservice.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class Passenger {

    private String name;
    private String  email;
    private String  from;
    private String to;
    private Long trainNumber;

}
