package com.example.student.college.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appID;
    private String appName;
    private String appDate;
    private String appStatus;
    @ManyToOne
    @JoinColumn(name = "onwerID")
    private Owner owner;
    public Application(int appID, String appName, String appDate, String appStatus, Owner owner) {
        this.appID = appID;
        this.appName = appName;
        this.appDate = appDate;
        this.appStatus = appStatus;
        this.owner = owner;
    }

    

}
