package com.practice;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by andrej on 04.07.17.
 */
public class Holidays {
    private int day;
    private int month;
    private int p1 = 1000;
    private int p2 = 2000;
    private int p3 = 3000;

    public Holidays(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public void getHolidays() {
        if (month >= 11 || month != 1 || month <= 4 || month <= 12) {
            System.out.println("Отдыхайте на курорте a и не забудьте, минимальная сумма для отдыха " + p1);
        } else if (month == 12 && month <= 3) {
            if (day > 15 && day <= 28) {
                System.out.println("Отдыхайте на курорте b и не забудьте, минимальная сумма для отдыха " + p2);
            }
        } else System.out.println("Отдыхайте на курорте c и не забудьте, минимальная сумма для отдыха " + p3);
    }
}
