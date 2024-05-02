package com.JavaPractice.PrimitivesDataType;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Num1 = ");
        int num1 = in.nextInt();

        System.out.print("Enter Num2 = ");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("The Sum of Two Number = "+sum);
    }
}
