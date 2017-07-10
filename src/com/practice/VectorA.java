package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by andrej on 04.07.17.
 */
public class VectorA {
    private int count = 0;
    private int b = 0;

    public VectorA(int count, int b) {
        this.count = count;
        this.b = b;
    }

    public void getSum() {
        try {
            int a[] = new int[count];
            int sum = 0;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < count; i++) {
                a[i] = Integer.parseInt(bufferedReader.readLine());
            }
            for (int i = 0; i <a.length ; i++) {
                if (a[i] == b){

                    for (int j = 0; j <i ; j++) {
                        sum+=a[j];
                    }
                }
                else System.out.println(" нет равных элементов ");
            }
            System.out.println("sum = "+sum);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
