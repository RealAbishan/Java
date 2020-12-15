package com.caseStudyOne;

import java.awt.*;
import java.util.Objects;

public class Car extends Vehicle {

    //Attribute of the Car Class
     private int noOFDoors;
     private Color color;


    //Constructors
    public Car(String idPlate, String brand, dateTime entryDateTime,int noOFDoors, Color color) {
        super(idPlate, brand, entryDateTime);
        this.noOFDoors = noOFDoors;
        this.color = color;
    }

    //Getters and Setter


    public int getNoOFDoors() {
        return noOFDoors;
    }

    public void setNoOFDoors(int noOFDoors) {
        this.noOFDoors = noOFDoors;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //ToString Method

    @Override
    public String toString() {
        return "Car{"+ super.toString() +
                "noOFDoors=" + noOFDoors +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return noOFDoors == car.noOFDoors &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), noOFDoors, color);
    }
}
