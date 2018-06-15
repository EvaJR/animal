package com.capgemini.animals;

import java.util.Scanner; // password check
// more comments

public class StringComparison {

    public static void main(String[] args) {

        String n = null;
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        do {
            System.out.println("Enter password: ");
            n = reader.nextLine(); // Scans the next token of the input as an int.

        }
        while (!strCompare(n));
        reader.close();

    }

    public static boolean strCompare(String a) {
        String password = "bing";

        if (a.toLowerCase().equals(password)) {
            System.out.println("Password accepted.");
            return true;
        } else {
            System.out.println("Password is incorrect");
            return false;
        }


    }


}

