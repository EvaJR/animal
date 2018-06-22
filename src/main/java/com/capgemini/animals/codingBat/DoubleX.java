package com.capgemini.animals.codingBat;

public class DoubleX {

    boolean doubleX(String str) {
        int i = str.indexOf('x');
        if (i == -1) {
            return false;
        }

        if (i < str.length() - 1) {

            return (str.charAt(i + 1) == 'x');
        }

        return false;


    }
}
