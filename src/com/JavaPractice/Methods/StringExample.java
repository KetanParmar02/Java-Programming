package com.JavaPractice.Methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
       // String message = greeting();
       // System.out.println(message);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        String message = greeting2(name);
        System.out.println(message);
    }

    // return the String value
    static String greeting() {
        String greet = "Hello";
        return greet;
    }

    // pass the value of the name when you are calling the method in the main method
    static String greeting2(String name) {
        return "Hello " + name;
    }
}
