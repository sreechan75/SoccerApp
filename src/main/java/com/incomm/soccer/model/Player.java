package com.incomm.soccer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Data
public class Player {
    @Id
    private Integer id;
    private String fname;
    private String lname;
    private String dob;
    private String team;
    private int age;

}
