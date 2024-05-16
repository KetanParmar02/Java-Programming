package com.JavaPractice.Condition_and_Loops;

import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {

        // write program for find the nth Fibonacci number.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the which Fibonacci number you want to find? = ");
        int num = input.nextInt();

        int FirstFibo  = 0;
        int SecondFibo = 1;
        int count = 2;

//        while (count <= num) {
//            int ThirdFibo = FirstFibo + SecondFibo;
//            FirstFibo = SecondFibo;
//            SecondFibo = ThirdFibo;
//            count++;
//        }
        while (count <= num) {
            int Temp = SecondFibo;
            SecondFibo = FirstFibo + SecondFibo;
            FirstFibo = Temp;
            count++;
        }
        System.out.println("The " + num + "th Fibonacci number is " + SecondFibo);
    }
}
