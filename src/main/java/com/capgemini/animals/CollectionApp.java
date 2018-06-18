package com.capgemini.animals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CollectionApp {

    public static void main(String[] args) {
        MotorCycle honda = new MotorCycle("Honda");
        MotorCycle suzuki = new MotorCycle("Suzuki");
        MotorCycle bmw = new MotorCycle("BMW");

        Set<MotorCycle> motorCycles = new HashSet<>();

        motorCycles.add(honda);
        motorCycles.add(suzuki);
        motorCycles.add(bmw);

        for (MotorCycle motorCycle : motorCycles) {
            System.out.println(motorCycle.getBrand());
        }
    }
}
