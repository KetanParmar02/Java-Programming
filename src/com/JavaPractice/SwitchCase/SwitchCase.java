package com.JavaPractice.SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Fruit Name: ");
        String fruitName = input.next();

        switch (fruitName) {
            case "Apple":
                System.out.println("Apple is Fruit");
                break;
            case "Banana":
                System.out.println("Banana is Fruit");
                break;
            case "Orange":
                System.out.println("Orange is Fruit");
                break;
            case "Mango":
                System.out.println("Mango is Fruit");
                break;
            case "Grapes":
                System.out.println("Grapes is Fruit");
                break;
            default:
                System.out.println("This is not Fruit");
                break;
        }

        System.out.print("Enter Vegetables Name: ");
        String vegetableName = input.next();

        switch (vegetableName) {
            case "Tomato" -> System.out.println("Tomato is Vegetable");
            case "Potato" -> System.out.println("Potato is Vegetable");
            case "Cabbage" -> System.out.println("Cabbage is Vegetable");
            case "Onion" -> System.out.println("Onion is Vegetable");
            case "Carrot" -> System.out.println("Carrot is Vegetable");
            default -> System.out.println("This is not a vegetables");
        }

        // Enhance switch statement example
        int day = 1;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
        System.out.println("------------------------------------------------");

        // Enhance switch statement example
        int day2 = 1;
        switch (day2) {
            case 1, 2, 3, 4, 5 -> System.   out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid Day");
        }

        // write a example of binary tree question

    }
}
