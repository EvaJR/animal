package com.capgemini.animals;

public class ExceptionTrainerApp {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("OOPS!");
        }
    }

}
