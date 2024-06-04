package com.JavaPractice.Methods;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        int sum2 = add(5, 10, 15);
        System.out.println(sum1);
        System.out.println(sum2);

        display(5, 10, "Hello", "World", "Java");
        display(5, "Hello");
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method overloading is when you have multiple methods with the same name but different parameters
    // Method overloading is not possible by changing the return type of the

    static void display(int a) {
        System.out.println(a);
    }

    static void display(int a, int b) {
        System.out.println(a + " " + b);
    }

    static void display(int a, int b, String ...c) {
        System.out.println(a + " " + b);
        System.out.println(Arrays.toString(c));
    }

    static void display(int a, String b) {
        System.out.println(a + " " + b);
    }
}
