package com.soft1841.punch1;

public class Calculation {
    public static void main(String[] args) {
        Shape shape = new Round();
        shape.radius= 7;
        shape.area();
        shape = new rectangle();
        shape.high = 3;
        shape.width = 9;
        shape.area();
    }
}
