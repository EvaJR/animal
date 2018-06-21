package com.capgemini.animals.weekdays;

import java.util.ArrayList;
import java.util.List;

public class MyFirstEnumApp {

    public static List<Student> students = new ArrayList<>();

    public static void addStudentToList(String name, WeekDay favourite, WeekDay leastFavourite) {



        Student student = new Student();
        student.setName(name);
        student.setMyFavouriteWeekday(favourite);
        student.setMyLeastFavouriteWeekday(leastFavourite);

        students.add(student);

    }


    public static void main(String[] args) {

        for(WeekDay elementOfWeekDays : WeekDay.values()) {
            System.out.println(elementOfWeekDays);
        }

        addStudentToList("Eva", WeekDay.SATURDAY, WeekDay.MONDAY );
        addStudentToList("Rachid", WeekDay.FRIDAY, WeekDay.MONDAY );
        addStudentToList("Raymond", WeekDay.SUNDAY, WeekDay.MONDAY );

        for(Student student : students) {
            System.out.println(student);
        }
    }
}
