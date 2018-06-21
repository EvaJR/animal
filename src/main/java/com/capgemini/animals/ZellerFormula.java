package com.capgemini.animals;

public class ZellerFormula {

    public int zellerFormula( int day, int romanMonth, int year, int century){
        int result = (day + (romanMonth * 26 - 2)/10 + year / 4 + year + century / 4 + 5 * century) % 7;
        return result;
    }


}
