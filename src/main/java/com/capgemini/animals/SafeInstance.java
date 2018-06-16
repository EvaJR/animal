package com.capgemini.animals;

public class SafeInstance {
    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setCar( "Porsche", "Red", "Coupe" );
        porsche.getCar();

        Car bentley = new Car();
        bentley.setCar( "Bentley", "Green", "Saloon" );
        bentley.getCar();

    }
}
