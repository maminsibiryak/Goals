package com.practice;

/**
 * Created by andrej on 09.07.17.
 */
public class PersonWeight {
    private int height = 0;
    private int weight = 0;


    public PersonWeight(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void getNormality(){
        if(weight >(height-100)){
            System.out.println("Лишний вес. Норма при вашем росте " + (height-100));
        }
        else if(weight < (height - 100)){
            System.out.println("Недовес.Норма при вашем росте " + (height-100));
        }
        else System.out.println("Нормаьлный вес");
    }
}
