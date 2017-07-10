package com.practice;

/**
 * Created by andrej on 09.07.17.
 */
public class TwoNumber {
    private int a = 0;
    private int b = 0;

    public TwoNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void getMaxNumber(){
        if(a > b){
            System.out.println("a>b");
        }
        else if(a==b){
            System.out.println("a=b");
        }
        else System.out.println("a<b");
    }
}
