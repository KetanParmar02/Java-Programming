package com.JavaPractice.Condition_and_Loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // write calculator program while user does not press X
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Operator = ");
            char ch = input.next().trim().charAt(0);
            if (ch == 'X' || ch == 'x') {
                break;
            }
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '%') {
                System.out.print("Enter First Number = ");
                int num1 = input.nextInt();
                System.out.print("Enter Second Number = ");
                int num2 = input.nextInt();
                if (ch == '+')
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                else if (ch == '-')
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                else if (ch == '*')
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                else if (ch == '/')
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                else if (ch == '%') {
                    if (num2 != 0)
                        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                }
                else System.out.println(num1 + " ^ " + num2 + " = " + (int) Math.pow(num1, num2));
            }

        }
    }
}
