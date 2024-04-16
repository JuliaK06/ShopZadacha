package com.company;

public class Laptop {
    private int yearOfProduction;
    private String brand;
    private double price;
    private String city;
    private String name;

    public Laptop() {
        this.yearOfProduction = 0;
        this.brand = null;
        this.price = 0;
        this.city = null;
        this.name = null;
    }


    public Laptop(int yearOfProduction, String brand, double price, String city, String name) {
        this.yearOfProduction = yearOfProduction;
        this.brand = brand;
        this.price = price;
        this.city = city;
        this.name = name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
