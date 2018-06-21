package com.capgemini.animals.bicycles;

public class BicyclePump implements BicyclePumpInterface {
    String brand;
    int pressure;

     public void pumpAir(int newPressure) {
        pressure = newPressure;
    }



    @Override
    public String toString() {
        return "BicyclePump{" +
                "brand='" + brand + '\'' +
                ", pressure=" + pressure +
                '}';
    }
}
