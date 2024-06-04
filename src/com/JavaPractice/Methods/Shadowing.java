package com.JavaPractice.Methods;

public class Shadowing {
    static int x = 10; // this will be shadowed by the local variable x in the main method at line 7
    public static void main(String[] args) {
        System.out.println(x); // 10
        int x; // scope will begin where variable is initialized not where it is declared
        x = 20; // this will shadow the class variable x
        System.out.println(x); // 20
        fun(); // 10
    }

    static void fun() {
        System.out.println(x); // 10
    }
}
