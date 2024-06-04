package com.JavaPractice.Methods;

public class Prime {
    public static void main(String[] args) {
        boolean ans = isPrime(7);
        System.out.println(ans);
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
