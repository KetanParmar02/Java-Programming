package com.JavaPractice.Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //sum();
        //int answer = sum2();
        //System.out.println("The sum of the two numbers is: " + answer);
        int answer = sum3(5, 10);
        System.out.println("The sum of the two numbers is: " + answer);
    }

    // return type is void because we are not returning anything
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
    }

    // return the value of the sum
    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    // pass the value of numbers when you are calling the method in the main method
    static int sum3(int num1, int num2){
        return num1 + num2;
    }
}
