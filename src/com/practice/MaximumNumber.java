package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by andrej on 28.06.17.
 */
public class MaximumNumber {
    private int k;


    public MaximumNumber(int k) {
        this.k = k;

    }

    public void findMax() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int[] count = new int[k];
        for (int i = 0; i < k; i++) {

            count[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i = 0; i < count.length; i++) {

            if (max < count[i]) {
                max = count[i];
            }

        }

        System.out.println("max number " + max);
    }
}
