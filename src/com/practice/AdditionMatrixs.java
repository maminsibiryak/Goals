package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by andrej on 29.06.17.
 */
public class AdditionMatrixs {
    private static int size = 0;

    public int setSizeMatrix(int size) {
        AdditionMatrixs.size = size;
        return AdditionMatrixs.size;
    }

    public void additionMatrixAandB() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrixA = new int[AdditionMatrixs.size][AdditionMatrixs.size];
        int[][] matrixB = new int[AdditionMatrixs.size][AdditionMatrixs.size];
        try {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA.length; j++) {
                    System.out.println(i + "|" + j);
                    matrixA[i][j] = Integer.parseInt(bufferedReader.readLine());
                }
            }


            for (int i = 0; i < matrixB.length; i++) {
                for (int j = 0; j < matrixB.length; j++) {
                    System.out.println(i + "|" + j);
                    matrixB[i][j] = Integer.parseInt(bufferedReader.readLine());
                }
            }

            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA.length; j++) {
                    System.out.print(matrixA[i][j] + matrixB[i][j]+"\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
