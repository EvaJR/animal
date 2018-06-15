package com.capgemini.animals;

public class Condition {
    public static void main(String[] args) {
        int num1 = 1357;
        int num2 = 2468;

        String result;

        result = ( num1 % 2 == 0 ) ? "Even" : "Odd"; // ?: is the conditional operator
        System.out.println( num1 + " is " + result );

    }
}
