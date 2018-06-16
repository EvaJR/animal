package com.capgemini.animals;

public class SubClass extends SuperClass {
    public static void main(String[] args) {
        hello();
        SuperClass.hello();

    }
   
    public static void hello()
    {
        System.out.println( "Hello from the Sub Class" );
    }

}
