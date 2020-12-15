package com.caseStudyOne;

public interface CarParkManager {


        void addVehicle(Vehicle vehicle);
        void removeVehicle(String idPlate);
        void printVehicleList();
        void statistics();
        void printVehicleByDay(dateTime day);
        void calculateCharges(Vehicle vehicle);

}
