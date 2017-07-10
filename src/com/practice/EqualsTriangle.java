package com.practice;

/**
 * Created by andrej on 02.07.17.
 */
public class EqualsTriangle {
    private int aFirst;
    private int bFirst;
    private int cFirst;
    private int aLast;
    private int bLast;
    private int cLast;

    public EqualsTriangle(int aFirst, int bFirst, int cFirst, int aLast, int bLast, int cLast) {
        this.aFirst = aFirst;
        this.bFirst = bFirst;
        this.cFirst = cFirst;
        this.aLast = aLast;
        this.bLast = bLast;
        this.cLast = cLast;
    }
    public void checkEqTr(){
        if(aFirst==aLast && bFirst==bLast && cFirst==cLast){
            System.out.println("Подобны");
        }
        else System.out.println("Треугольники не подобны");
    }
}
