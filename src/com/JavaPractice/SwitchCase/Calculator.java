package com.JavaPractice.SwitchCase;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        int num1 = 10;
//        int num2 = 20;
//        char operator = '+';
//
//        switch (operator) {
//            case '+':
//                System.out.println("Addition: " + (num1 + num2));
//                break;
//            case '-':
//                System.out.println("Subtraction: " + (num1 - num2));
//                break;
//            case '*':
//                System.out.println("Multiplication: " + (num1 * num2));
//                break;
//            case '/':
//                System.out.println("Division: " + (num1 / num2));
//                break;
//            default:
//                System.out.println("Invalid Operator");
//                break;
//        }

        // Using Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Operator: ");
        char operator = input.next().charAt(0);

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%' || operator == '^') {
            System.out.print("Enter First Number: ");
            int num1 = input.nextInt();

            System.out.print("Enter Second Number: ");
            int num2 = input.nextInt();

            switch (operator) {
                case '+':
                    System.out.println("Addition: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Subtraction: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Multiplication: " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("Division: " + (num1 / num2));
                    break;
                case '%':
                    System.out.println("Modulus: " + (num1 % num2));
                    break;
                case '^':
                    System.out.println("Power: " + Math.pow(num1, num2));
                    break;
                default:
                    System.out.println("Invalid Operator");
                    break;
            }
        }
        else {
            System.out.println("Invalid Operator");
        }
    }
}
