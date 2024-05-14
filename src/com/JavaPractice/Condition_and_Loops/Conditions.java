package com.JavaPractice.Condition_and_Loops;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        /*
            Syntax
            if (condition T or F) {
                // if condition is true then condition is executed
                // otherwise else condition is executed
                // do this
            }else{
                // do this
            }
         */

        Scanner input = new Scanner(System.in);

        // Example 1
        System.out.print("Enter a Salary = ");
        double salary = input.nextDouble();
        if (salary > 50000){
            System.out.println("You are eligible for Loan");
        }else{
            System.out.println("You are not eligible for Loan");
        }

        if (salary < 5000)
            salary += 1000;
        else if ( salary > 5000 && salary <= 10000)
            salary += 2000;
        else
            salary += 3000;
        System.out.println("Your Salary is = "+salary);

        // Example 2
        System.out.print("Enter your Age = ");
        int age = input.nextInt();
        if (age >= 18){
            System.out.println("You are eligible for Voting");
        }else{
            System.out.println("You are not eligible for Voting");
        }

        // Example 3
        if (age >= 18 && age <= 60)
            System.out.println("You are eligible for Give Test Driving");
        else
            System.out.println("You are not eligible for Give Test Driving");
    }
}
