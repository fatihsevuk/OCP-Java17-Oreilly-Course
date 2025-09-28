package com.fatihsevuk.java17.lesson10_scope_accessibility.encapsulation;

public class Date {

    private int year;
    private int month;
    private int day;

    public Date(int day, int month, int year) {

        var var = 70;

        if (isValid(day,month,year)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid value for a date");
        }
    }

    public boolean isValid(int day, int month, int year) {
        return  day >= 1 && day <= 31 && month >=1 && month <= 12 && year >= 1 && year <= 9999;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isValid(this.day,month,this.year)) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month value for a date");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isValid(this.day,this.month,year)) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year value for a date");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValid(day,this.month,this.year)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day value for a date");
        }
    }
}

class DemoDate {
    public static void main(String[] args) {
        Date d = new Date(10,12,2021);
        System.out.println("day: " + d.getDay());
        // d.day = -1;
        // d.setDay(-1);
        // System.out.println("day: " + d.getDay());
    }
}
