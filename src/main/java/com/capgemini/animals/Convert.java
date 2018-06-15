package com.capgemini.animals;

public class Convert {
    public static void main(String[] args) {
        float daysFloat = 365.25f;
        String weeksString = "52";

        int daysInt = (int) daysFloat; // changing float to int
        int weeksInt = Integer.parseInt( weeksString ); // changing string to int

        int week = ( daysInt / weeksInt );
        System.out.println( "Days per week: " + week );

    }
}
