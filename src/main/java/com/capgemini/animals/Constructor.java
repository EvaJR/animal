package com.capgemini.animals;

public class Constructor {
    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.getCar();

        Car Ferrari = new Car();
        Ferrari.setCar( "Ferrari", "Red", "Sport" );
        Ferrari.getCar();

    }
}
