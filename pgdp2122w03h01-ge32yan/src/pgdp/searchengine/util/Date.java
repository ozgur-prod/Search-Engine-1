package pgdp.searchengine.util;

import pgdp.searchengine.pagerepository.Author;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }



    public boolean equals(Date date2){
        if (this.day == date2.getDay() && this.month == date2.getMonth() && this.year == date2.getYear()){
            return true;
        }
        else {
            return false;
        }

    }

    public String toString(){
        return day + "." + month + "." + year;
    }





}
