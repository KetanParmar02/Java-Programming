package com.JavaPractice.Condition_and_Loops;

import java.util.Scanner;

public class Que_5 {
    public static void main(String[] args) {
        // reverse the number program
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse = ");
        int num = input.nextInt();

        int ans = 0;
        while (num > 0) {
            int remainder = num % 10;
            ans = (ans * 10) + remainder;
            num = num / 10;
        }
        System.out.println("The reverse of the number is " + ans);
    }
}
