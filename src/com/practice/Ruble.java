package com.practice;

/**
 * Created by andrej on 09.07.17.
 */
public class Ruble {
    private int rub;

    public Ruble(int rub) {
        this.rub = rub;
    }

    public void getEnd(){
        if(rub % 10 == 1||rub <10){
            System.out.println(rub + " рубль");
        }
        else if(rub%10>1 && rub%10<=4){
            System.out.println(rub+" рубля");
        }
        else System.out.println(rub + " рублей");
    }
}
