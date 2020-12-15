package com.caseStudyOne;

import java.util.Objects;

public class Van extends Vehicle {

    //Attributes of Van

    private int cargoVolume;


    //Constructor
    public Van(String idPlate, String brand, dateTime entryDateTime,int cargoVolume) {
        super(idPlate, brand, entryDateTime);
        this.cargoVolume = cargoVolume;
    }

    //Getters and Setters
    public int getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(int cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    //ToString Method


    @Override
    public String toString() {
        return "Van{"+ super.toString() +
                "cargoVolume=" + cargoVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Van van = (Van) o;
        return cargoVolume == van.cargoVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargoVolume);
    }
}
