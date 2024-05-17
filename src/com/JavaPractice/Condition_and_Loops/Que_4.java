package com.JavaPractice.Condition_and_Loops;

import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {

        // Count the digit of present in the number how many times
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 0
//        int num = 1234567890;
//        int count = 0;
//
//        while (num > 0) {
//            num = num / 10;
//            count++;
//        }
//
//        System.out.println("Count = " + count);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number = ");
        int num = input.nextInt();

        System.out.print("Enter Digit = ");
        int digit = input.nextInt();

        int count = 0;

        while (num > 0) {
            int remainder = (num % 10);
            if (remainder == digit){
                count++;
            }
            num = num / 10;
        }
        System.out.println("The Given digit is " + count + " time present in the Number");
    }
}
