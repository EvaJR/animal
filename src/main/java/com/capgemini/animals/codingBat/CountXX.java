package com.capgemini.animals.codingBat;

public class CountXX {

    int countXX(String str) {
        int i;
        int counter = 0;


        for (i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                counter ++;
            }
        }
        return counter;

    }

}
