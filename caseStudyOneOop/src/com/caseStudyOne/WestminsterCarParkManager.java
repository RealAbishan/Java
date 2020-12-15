package com.caseStudyOne;

import java.util.ArrayList;
import java.util.List;

public class WestminsterCarParkManager implements CarParkManager {

    public final static  int MAX_SLOTS =20;
    private int availableSlots =MAX_SLOTS;
    private List<Vehicle> vehicleList = new ArrayList<>();

    //Implementations for the methods in the Interface


    //Add a new Vehicle To the Car Park
    @Override
    public void addVehicle(Vehicle vehicle) {

        if (vehicleList.contains(vehicle)){
            System.out.println("Vehicle is already there");
        }
        else if (availableSlots >= MAX_SLOTS){
            System.out.println("There is no Slots to Park the Vehicle");
        }
        else if (vehicle instanceof Van && availableSlots <2){
                System.out.println("Car Park is Full");
            }
        else {
            vehicleList.add(vehicle);
            availableSlots -= vehicle instanceof Van ? 2:1;
            System.out.println(availableSlots > 0 ? ("Free Slots Available in: the Car park") + " " + availableSlots: "No ore Parking Sape Available");

        }

    }

    @Override
    public void removeVehicle(String idPlate) {

    }

    @Override
    public void printVehicleList() {

    }

    @Override
    public void statistics() {

    }

    @Override
    public void printVehicleByDay(dateTime day) {

    }

    @Override
    public void calculateCharges(Vehicle vehicle) {

    }


}
