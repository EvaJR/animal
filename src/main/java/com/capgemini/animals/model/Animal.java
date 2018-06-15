package com.capgemini.animals.model;

public class Animal {

    int numberOfLegs;
    String name;

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public Animal() {

    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void roar() {
        System.out.println("Rawr!!!");
    }



}
