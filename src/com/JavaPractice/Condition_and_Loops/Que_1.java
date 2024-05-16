package com.JavaPractice.Condition_and_Loops;

import java.util.Scanner;

public class Que_1 {
    public static void main(String[] args) {

        // Find the largest number of given number
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number1 = ");
        int num1 = input.nextInt();

        System.out.print("Enter Number2 = ");
        int num2 = input.nextInt();

        System.out.print("Enter Number3 = ");
        int num3 = input.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("The Largest Number = "+num1);
        } else if (num2 > num3) {
            System.out.println("The Largest Number = "+num2);
        }else{
            System.out.println("The Largest Number = "+num3);
        }

        // Using Math.max() method
        int max = Math.max(num3, Math.max(num1, num2));
        System.out.println("Max Number = "+ max);
    }
}
