package com.capgemini.animals;

import com.capgemini.animals.model.*;

public class AnimalApp {

    public static void main(String[] args) {

        Animal alligator = new Animal();

        System.out.println(alligator.getNumberOfLegs());

        Animal dog = new Mammal(); // polymorphism, new animal with mammal properties

        System.out.println(dog.getNumberOfLegs());

        dog.roar();
        // dog.test(); // animal kent geen test.

    }
}
