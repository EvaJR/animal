package com.capgemini.animals;

public class FirstInstance {
    public static void main(String[] args) {
        System.out.println( "Car paint is " + Car.color );
        System.out.println( "Car style is "+ Car.bodyType );
        System.out.println( Car.accelerate() );

        Car porsche = new Car();

        System.out.println( "porsche paint is " + porsche.color );
        System.out.println( "porsche style is " + porsche.bodyType );
        System.out.println( porsche.accelerate() );

    }
}
