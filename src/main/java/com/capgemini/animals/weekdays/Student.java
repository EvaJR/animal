package com.capgemini.animals.weekdays;

public class Student {
    String name;

    WeekDay myFavouriteWeekday;

    WeekDay myLeastFavouriteWeekday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeekDay getMyFavouriteWeekday() {
        return myFavouriteWeekday;
    }

    public void setMyFavouriteWeekday(WeekDay myFavouriteWeekday) {
        this.myFavouriteWeekday = myFavouriteWeekday;
    }

    public WeekDay getMyLeastFavouriteWeekday() {
        return myLeastFavouriteWeekday;
    }

    public void setMyLeastFavouriteWeekday(WeekDay myLeastFavouriteWeekday) {
        this.myLeastFavouriteWeekday = myLeastFavouriteWeekday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", myFavouriteWeekday=" + myFavouriteWeekday +
                ", myLeastFavouriteWeekday=" + myLeastFavouriteWeekday +
                '}';
    }
}
