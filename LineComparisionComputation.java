package com.bl.lc;

import java.util.Scanner;

public class LineComparisionComputation {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the value of (X1 & X2) & (Y1 & Y2) : ");
            float X1 = sc.nextFloat();
            float X2 = sc.nextFloat();
            float Y1 = sc.nextFloat();
            float Y2 = sc.nextFloat();

            double lengthOfLineA = Math.sqrt(((X2 - X1) * (X2 - X1)) + ((Y2 - Y1) * (Y2 - Y1)));
            System.out.println("Two points of Line A are :  " + lengthOfLineA);

            System.out.println("Enter the value of (R1 & R2) & (S1 & S2) : ");
            float R1 = sc.nextFloat();
            float R2 = sc.nextFloat();
            float S1 = sc.nextFloat();
            float S2 = sc.nextFloat();

            double lengthOfLineB = Math.sqrt(((R2 - R1) * (R2 - R1)) + ((S2 - S1) * (S2 - S1)));
            System.out.println("Two points of Line A are :  " + lengthOfLineB);

            String st1 = String.valueOf(lengthOfLineA);
            String st2 = String.valueOf(lengthOfLineB);

            if (st1.equals(st2))
                System.out.println(" Line A and Line B are equal ");
            else
                System.out.println("Line A and Line B are NOT equal");

            System.out.println("Length Of Line A is : " + lengthOfLineA);
            System.out.println("Length Of Line B is : " + lengthOfLineB);
        }
    }