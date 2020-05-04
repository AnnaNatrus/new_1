package com.test;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        try {
            triangle.setPointOne(0, 0);
            triangle.setPointTwo(0, 0);
            triangle.setPointThree(4, -8);
            triangle.countSides();
            triangle.checkExeptions();
            triangle.areaTr();
        } catch (MyException ex) {
            System.out.println(ex.toString());
//			System.out.println(ex.getMessage());
        }
    }

}
