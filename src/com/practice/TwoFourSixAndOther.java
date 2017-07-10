package com.practice;

/**
 * Created by andrej on 09.07.17.
 */
public class TwoFourSixAndOther {
    private int a = 0;

    public TwoFourSixAndOther(int a) {
        this.a = a;
    }

    public void getAnswer(){
        if(a%2==0){
            System.out.println("четное");
        }
        else System.out.println("no");
    }
}
