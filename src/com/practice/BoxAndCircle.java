package com.practice;

/**
 * Created by andrej on 04.07.17.
 */
public class BoxAndCircle {
    private int aBox = 0;
    private int aCircle = 0;

    public BoxAndCircle(int aBox, int aCircle) {
        this.aBox = aBox;
        this.aCircle = aCircle;
    }

    public void getAnswer(){
        int r = (int) (aCircle/2*Math.PI);
        if(r == aBox/2){
            System.out.println("Enter");
        }
        else System.out.println("No");
    }
}
