package com.caseStudyOne;

import java.awt.*;

public class Test {
    static public void main(String[] args) {
        System.out.println("Testing For Add Vehicle");


        Vehicle c1 = new Car("CAN-1254", "Toyota", new dateTime(1,12,2020,5,25),
                4, Color.RED);

        Vehicle c2 = new Car("CAN-1254", "Toyota", new dateTime(1,12,2020,5,25),
                4, Color.RED);

        Vehicle c3 = c2;

        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
