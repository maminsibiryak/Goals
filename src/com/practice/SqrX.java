package com.practice;

/**
 * Created by andrej on 28.06.17.
 */
public class SqrX {
    private int a;
    private int b;
    private int c;

    public SqrX(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void findDescriminante() {
        double x1 = 0, x2 = 0;
        double d;

        d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / 2 * a;
            x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("x1= " + x1 + "| x2= " + x2);
        } else if (d == 0) {
            x1 = (-b + Math.sqrt(d)) / 2 * a;
            System.out.println("x1= " + x1);
        } else System.out.println("D<0. Sorry, no answer");
    }
}
