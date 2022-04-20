package com.example.restfullservice.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name="student")
public class Student {

    private Integer id;
    private String name;
    private Integer rank;
}
