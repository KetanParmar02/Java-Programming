package com.JavaPractice.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        // array of primitive data type
//        // input using for loop
//        int[] rollNumbers = new int[5];
//
//        // taking input from user
//        for(int i = 0; i < rollNumbers.length; i++) {
//            rollNumbers[i] = input.nextInt();
//        }
//
//        // printing the roll numbers
//        for(int i = 0; i < rollNumbers.length; i++) {
//            System.out.print(rollNumbers[i]+ " ");
//        }
//
//        // enhanced for loop
//        for(int num : rollNumbers) {  // for every element in array, print the element
//            System.out.print(num + " "); // num is the element of array
//        }
//
//        // printing the roll numbers using Arrays class
//        System.out.println(java.util.Arrays.toString(rollNumbers));

        // array of objects
        String[] names = new String[5];

        System.out.print("Enter 5 names: ");
        for(int i = 0; i < names.length; i++) {
            names[i] = input.next();
        }

        System.out.println(Arrays.toString(names));

        // modify the element of array
        names[0] = "John";
        System.out.println(Arrays.toString(names));
    }
}
