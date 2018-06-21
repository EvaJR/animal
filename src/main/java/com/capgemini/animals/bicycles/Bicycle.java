package com.capgemini.animals.bicycles;

public class Bicycle {

    int gear = 0;
    int speed = 0;

    void changeGear(int newGear) {
        gear = newGear;
    }

    void changeSpeed(int newSpeed) {
        speed = newSpeed;
    }

    void printStates() {
        System.out.println("gear: " + gear + " speed: " + speed);
    }

}
