package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tv {
    private int price;
    private double diagonal;
    private int year;
    private String name;
    private String manufacturer;

    public Tv(String manufacturer, String name, int year, double diagonal, int price) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
        this.diagonal = diagonal;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String toString() {
        return "Manufacturer:" + manufacturer + " " + "," + "Name:" + name + " " + "," + "Diagonal:"+ diagonal + " " + "," + "Year:" + year + " " + "," + "Price:" + price + " ";
    }
}

