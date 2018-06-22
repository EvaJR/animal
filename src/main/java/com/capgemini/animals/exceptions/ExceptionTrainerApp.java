package com.capgemini.animals.exceptions;

public class ExceptionTrainerApp {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        int result;
        result = divide(a, b);
        System.out.println(result);

//        try {
//            System.out.println(a / b);
//        } catch (Exception e) {
//            System.out.println("OOPS!");
//        }
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException ae) {
            throw new ImpossibleToDivideByZero();
        }
    }

}
