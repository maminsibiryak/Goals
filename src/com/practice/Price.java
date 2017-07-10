package com.practice;

/**
 * Created by andrej on 09.07.17.
 */
public class Price {
    private double money;
    private final double prosentFive = 0.05;
    private final double procentThree = 0.03;

    public Price(double money) {
        this.money = money;
    }

    public void checkHowMuchMoney(){
        if(money >=500&&money <1000){
            money-=money*procentThree;
            System.out.printf("Скидка 3 , к оплате %8.2f", money);
        }else if (money>=1000){
            money-=money*prosentFive;
            System.out.printf("Скидка 5, к оплате %8.2f", money);
           // System.out.printf("%8.2f", money);
        }else System.out.println("к оплате "+money);
    }
}
