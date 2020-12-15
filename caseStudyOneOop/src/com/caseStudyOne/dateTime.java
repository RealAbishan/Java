package com.caseStudyOne;

import java.util.Objects;

public class dateTime {

    //Date class which is going to be an Attribute of the Vehicle Class


    //Attributes of the date and time
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minutes;


    //Constructors
    public dateTime(int day, int month, int year, int hour, int minutes) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minutes = minutes;
    }


    //Getters and Setters
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }


    //To string Methods


    @Override
    public String toString() {
        return "dateTime{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", hour=" + hour +
                ", minutes=" + minutes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dateTime dateTime = (dateTime) o;
        return day == dateTime.day &&
                month == dateTime.month &&
                year == dateTime.year &&
                hour == dateTime.hour &&
                minutes == dateTime.minutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year, hour, minutes);
    }
}
