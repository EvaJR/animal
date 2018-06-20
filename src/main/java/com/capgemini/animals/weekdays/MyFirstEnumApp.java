package com.capgemini.animals.weekdays;

public class MyFirstEnumApp {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Eva");
        student.setMyFavouriteWeekday(WeekDay.SATURDAY);
        student.setMyLeastFavouriteWeekday(WeekDay.MONDAY);

        System.out.println(student);
    }
}
