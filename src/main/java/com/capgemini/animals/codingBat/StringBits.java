package com.capgemini.animals.codingBat;

public class StringBits {

    public String stringBits(String str) {
        int i;
        String newString = "";

        for (i = 0; i < str.length(); i += 2) {
            newString = newString + str.charAt(i);

        }

        return newString;
    }

}
