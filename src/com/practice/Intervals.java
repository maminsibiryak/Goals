package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by andrej on 01.07.17.
 */
public class Intervals {
    private int number;

    public void chekNumber(int number) {
        this.number = number;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите кол-во интервалов ");
            int intervals = Integer.parseInt(bufferedReader.readLine());
            int[] interval = new int[(intervals * 2)];
            System.out.println("Введите интервалы");
            for (int i = 0; i < interval.length; i++) {
                interval[i] = Integer.parseInt(bufferedReader.readLine());
            }

            for (int i = 0; i < interval.length; i = i + 2) {
                if (number >= interval[i] && number <= interval[i + 1]) {
                    System.out.println(number + " входит в интервал от " + interval[i] + " до " + interval[i + 1]);
                } else System.out.println("не входит");
            }

        } catch (Exception e) {

        }
    }
}
