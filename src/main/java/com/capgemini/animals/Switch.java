package com.capgemini.animals;

public class Switch {
    public static void main(String[] args) {
        int month = 2, year = 2016, num = 31;

        switch ( month )
        {
            case 4 : case 6 : case 9 : case 11 : num = 30; break; // april, june, september, november have 30 days

            case 2 : num = ( year % 4 == 0 ) ? 29 : 28; break; // special case for february
        }

        System.out.println( month+"/"+year+": "+num+" days" ); // prints the number of days in a certain month
    }
}
