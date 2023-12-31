package com.volkswagen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Jyoti";
    @Autowired
    private Vehicle vehicle;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }
}
