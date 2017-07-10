package com.practice;

/**
 * Created by andrej on 09.07.17.
 */
public class Year {
    private int year;

    public Year(int year) {
        this.year = year;
    }

    public void checkYear(){
        if(year %4==0){
            System.out.println("високосный");
        }
        else System.out.println("не високосный");
    }
}
