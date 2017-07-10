package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by andrej on 02.07.17.
 */
public class SosShip {
    private double x0 = 5.0;
    private double y0 = 5.0;
    private double x;
    private double y;
    private double [] result;

    public SosShip() {
    }

    public SosShip(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public double getDistanse() {
        double result = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {


            result = Math.sqrt(Math.pow((x - x0), 2) + Math.pow((y - y0), 2));
        } catch (Exception e) {

        }
        return result;
    }

    public double getMinStaff(double [] result){
        this.result = result;
        double min = result[0];
        for (int i = 0; i <result.length ; i++) {
            if (result[i] < min){
                min = result[i];
            }
        }
        return  min;

    }
}
