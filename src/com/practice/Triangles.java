package com.practice;

/**
 * Created by andrej on 28.06.17.
 */
public class Triangles {
    private int a;
    private int b;
    private int c;

    public Triangles(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void findAnswer() {
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            if (a == b && a == c && b == c) {
                System.out.println("Равносторонний");
            } else if (a == b || a == c || b == c) {
                System.out.println("Равнобедренный");
            } else System.out.println("Прямоугльный");
        } else System.out.println("нельзя построить треугольник");
    }
}
