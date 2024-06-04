package com.JavaPractice.Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        sum(1, 2, 3, 4, 5);
        sum();
        multipleParameters(5, "Hello", "World", "Java");
    }

    static void sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        System.out.println(Arrays.toString(arr) + " = " + result);
    }

    // multiple parameters
    static void multipleParameters(int a, String... values) {
        System.out.println(a);
        System.out.println(Arrays.toString(values));
    }
}
