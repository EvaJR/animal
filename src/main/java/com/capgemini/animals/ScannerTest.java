package com.capgemini.animals;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a string: ");
        String n = reader.nextLine(); // Scans the next token of the input as an int.
        System.out.println("Enter a number: ");
        int x = reader.nextInt();
//once finished
        reader.close();
        System.out.println("User input was " + n + Integer.toString(x));
    }
}
