package com.caseStudyOne;

import java.util.Objects;

public class MotorBike extends Vehicle {

    //Attributes of motorbikes
    private int engineSize;


    //Constructor
    public MotorBike(String idPlate, String brand, dateTime entryDateTime,int engineSize) {
        super(idPlate, brand, entryDateTime);
        this.engineSize = engineSize;
    }

    //Getters and Setters

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    //ToString Method

    @Override
    public String toString() {
        return "MotorBike{"+super.toString() +
                "engineSize=" + engineSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MotorBike motorBike = (MotorBike) o;
        return engineSize == motorBike.engineSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineSize);
    }
}
