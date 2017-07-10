package com.practice;

/**
 * Created by andrej on 09.07.17.
 */
public class WeekDay {
    private  int dayOfWeek;

    public WeekDay(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void getWorkDayOrHoliday() {
        switch (dayOfWeek){
            case 1 :
                System.out.println("Work day"); break;
            case 2:
                System.out.println("Work day");break;
            case 3 :
                System.out.println("Work day");break;
            case 4:
                System.out.println("Work day");break;
            case 5 :
                System.out.println("Work day");break;
            case 6:
                System.out.println("Holiday");break;
            case 7 :
                System.out.println("Holiday");break;
                default:
                    System.out.println("error");
        }
    }
}
