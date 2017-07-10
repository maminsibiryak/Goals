package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by andrej on 29.06.17.
 */
public class MatrixMutiplication {
    private static int aSize = 0;

    public int setSizeMatrix(int aSize) {
        MatrixMutiplication.aSize = aSize;
        return MatrixMutiplication.aSize;
    }

    public void matrixMutiplicationAandB() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrixA = new int[MatrixMutiplication.aSize][MatrixMutiplication.aSize];
        int[][] matrixB = new int[MatrixMutiplication.aSize][MatrixMutiplication.aSize];
        int[][] matrixC = new int[MatrixMutiplication.aSize][MatrixMutiplication.aSize];
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

            for (int i = 0; i < matrixC.length; i++) {
                for (int j = 0; j < matrixC.length; j++) {
                    for (int k = 0; k < MatrixMutiplication.aSize; k++) {


                        matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
                System.out.println();
            }

            for (int i = 0; i < matrixC.length; i++) {
                for (int j = 0; j < matrixC.length; j++) {


                    System.out.print(matrixC[i][j] + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


