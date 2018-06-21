package com.capgemini.animals;

public class ZellerMain {

    public static void main(String[] args) {

        String name = "Charlotte";
        int yearOfBirth = 1993;
        int month = 12;
        int day = 18;

        int year = yearOfBirth % 100;
        int century = yearOfBirth / 100;
        int romanMonth = month - 2;
        String weekday = "";
        ZellerFormula z = new ZellerFormula();
        int r = z.zellerFormula(day, romanMonth, year, century);

        switch (r) {
            case 0: weekday = "Sunday"; break;
            case 1: weekday = "Monday"; break;
            case 2: weekday = "Tuesday"; break;
            case 3: weekday = "Wednesday";break;
            case 4: weekday = "Thursday"; break;
            case 5: weekday = "Friday"; break;
            case 6: weekday = "Saturday"; break;
        }

        System.out.println(name + " was born on a " + weekday);

    }
}
