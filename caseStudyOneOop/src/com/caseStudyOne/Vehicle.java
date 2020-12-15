package com.caseStudyOne;

import java.util.Objects;

public abstract class Vehicle {

    //Attributes of the Vehicle class

    private String idPlate;
    private String brand;
    private dateTime entryDateTime;

    //Constructor of the Vehicle class


    public Vehicle(String idPlate, String brand, dateTime entryDateTime) {
        this.idPlate = idPlate;
        this.brand = brand;
        this.entryDateTime = entryDateTime;
    }


    //Getters and Setters of the Vehicle Class

    public String getIdPlate() {
        return idPlate;
    }

    public void setIdPlate(String idPlate) {
        this.idPlate = idPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public dateTime getEntryDateTime() {
        return entryDateTime;
    }

    public void setEntryDateTime(dateTime entryDateTime) {
        this.entryDateTime = entryDateTime;
    }

    //To String of the Vehicle Class

    @Override
    public String toString() {
        return
                "idPlate='" + idPlate + '\'' +
                ", brand='" + brand + '\'' +
                ", entryDateTime= '" + entryDateTime + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(idPlate, vehicle.idPlate) &&
                Objects.equals(brand, vehicle.brand) &&
                Objects.equals(entryDateTime, vehicle.entryDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPlate, brand, entryDateTime);
    }
}
