package com.capgemini.animals;

import java.util.*;


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

        {
            Map<String, MotorCycle> myMotorCycleStore = new HashMap<>();

            myMotorCycleStore.put("AABBCC", honda);
            myMotorCycleStore.put("SU11KU", suzuki);
            myMotorCycleStore.put("ABMW3", bmw);

            MotorCycle retrievedMotor = myMotorCycleStore.get("AABBCC");

            System.out.println("Retrieved from the hashmap: " + retrievedMotor.getBrand());

            for (String key : myMotorCycleStore.keySet()) {
                System.out.print(key + ", ");
            }

            System.out.println();

            for (MotorCycle value : myMotorCycleStore.values()) {
                System.out.print(value.getBrand() + ", ");
            }

            System.out.println();

            for(Map.Entry<String, MotorCycle> keyValuePair : myMotorCycleStore.entrySet()) {
                System.out.print("Key: " + keyValuePair.getKey() + ". ");
                System.out.println("Value: " + keyValuePair.getValue().getBrand());
            }
        }
    }
}
