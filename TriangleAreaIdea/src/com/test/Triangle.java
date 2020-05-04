package com.test;

public class Triangle {
    double x1, y1, x2, y2, x3, y3;
    double aside;
    double bside;
    double cside;

    double halfperimeter;
    double area;

    public void setPointOne(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public void setPointTwo(double x2, double y2) {
        this.x2 = x2;
        this.y2 = y2;
    }

    public void setPointThree(double x3, double y3) {
        this.x3 = x3;
        this.y3 = y3;
    }

    public void countSides() {
        aside = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        bside = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        cside = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
    }

    public void checkExeptions() throws MyException {
        if (aside + bside <= cside || aside + cside <= bside || bside + cside <= aside) {
//			throw new MyExeption ("Such triangle does not exist.");
            throw new MyException();
        }
    }

    public void areaTr() {
        double halfperimeter = (aside + bside + cside) / 2.0;
        double area = Math.sqrt(halfperimeter * (halfperimeter - aside) * (halfperimeter - bside) * (halfperimeter - cside));
        System.out.println("Area of triangle: " + area);
    }

}

