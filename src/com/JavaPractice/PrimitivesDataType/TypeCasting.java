package com.JavaPractice.PrimitivesDataType;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Automatic Type Casting
        // Wide casting
        Float num = in.nextFloat();
        System.out.println(num);

        // Explicitly Type Casting
        // Narrow Casting
        int num1 = (int) (67.8736489);
        System.out.println(num1);

        // Automatic Type Promotion rule
        short a = 46;
        short b = 78;
        int ans = (a*b) / 100;
        System.out.println(ans);
    }
}
