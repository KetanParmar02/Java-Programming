package com.JavaPractice.Array;

public class Main {
    public static void main(String[] args) {
        // Q. store 5 roll numbers in an array and print them
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;

        // instead of creating 5 variables, we can create an array
        // syntax: datatype[] variable_name = new datatype[size];

//        int[] rollNumbers = new int[5];
//        // or directly
//        int[] rollNumbers2 = {1, 2, 3, 4, 5};

        int rollNumbers[]; // declaration of array. rollNumbers is getting defined in stack memory
        rollNumbers = new int[5]; // initialization of array. actually here object is getting created in heap memory

        System.out.println(rollNumbers[0]); // default value of int is 0

        String[] names = new String[5];
        System.out.println(names[0]); // default value of String is null
    }
}
