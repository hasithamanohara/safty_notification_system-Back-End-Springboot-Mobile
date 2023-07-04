package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class emgPersonDto {

    private String firstName;
    private  String lastName;
    private String emailId;
    private int phoneNo;
}
