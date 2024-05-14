package com.JavaPractice.Condition_and_Loops;

public class Loops {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("------------------------------------------------");

        // while loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("------------------------------------------------");

        // do while loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        System.out.println("------------------------------------------------");

        // for each loop
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println(num);
        }

        System.out.println("------------------------------------------------");

        // break
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                break;
            }
            System.out.println(k);
        }

        System.out.println("------------------------------------------------");

        // continue
        for (int l = 0; l < 10; l++) {
            if (l == 5) {
                continue;
            }
            System.out.println(l);
        }

        System.out.println("------------------------------------------------");

        // 3 Table print using loops
        int q = 3;
        for(int p = 1; p <= 10; p++) {
            System.out.println(q + " X " + p + " = " + (q*p));
        }
    }
}
