package com.capgemini.animals.codingBat;

public class StringSplosion {

    public String stringSplosion(String str) {
        int i;
        String result = "";

        for(i = 1; i <= str.length(); i++) {

            result = result + str.substring(0, i);

        }

        return result;
    }
}
