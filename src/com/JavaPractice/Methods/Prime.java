package com.JavaPractice.Methods;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        //boolean ans = isPrime(7);
        //System.out.println(ans);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean ans = isPrime2(num);
        System.out.println(ans);
    }

    // using for loop
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

    // using while loop
    static boolean isPrime2(int num){
        if (num <= 1){
            return false;
        }
        else {
            int check = 2;
            while(check * check <= num){
                if (num % check == 0){
                    return false;
                }
                check++;
            }
            return check * check > num;
        }
    }
}
