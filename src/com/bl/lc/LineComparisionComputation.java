package com.bl.lc;

import java.util.Scanner;

public class LineComparisionComputation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of X1 & X2");
        float X1 = sc.nextFloat();
        float X2 = sc.nextFloat();

        System.out.println("Enter the value of Y1 & Y2");
        float Y1 = sc.nextFloat();
        float Y2 = sc.nextFloat();

        double length = Math.sqrt(( X2 - X1 ) * ( X2 - X1 ) + ( Y2 - Y1) * ( Y2 - Y1 ));
        System.out.println("Length of Line is :  "+ length);
    }
}