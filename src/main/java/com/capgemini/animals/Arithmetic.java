package com.capgemini.animals;

public class Arithmetic {
    public static void main(String[] args) {
        int num = 100;
        int factor = 20;
        int sum = 0;

        sum = num + factor; // 100 + 20
        System.out.println( "Addition sum: " + sum );
        sum = num - factor; // 100 - 20
        System.out.println( "Subtraction sum: " + sum );

        String txt = "Fantastic ";
        String lang = "Java";
        txt += lang; // Assign concatenated String
        System.out.println( "Add & Assign Strings: " + txt );


        boolean state = ( txt == lang ); // Assign test result
        System.out.println( "String Equality Test: " + state );
    }
}
