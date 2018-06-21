package com.capgemini.animals;

public class ZellerMain {

    public static void main(String[] args) {

        int year = 90;
        int century = 19;
        int month = 4;
        int romanMonth = month - 2;
        int day = 21;
        ZellerFormula z = new ZellerFormula();
        int r = z.zellerFormula(day, romanMonth, year, century);




        System.out.println(r);


    }
}
