package com.JavaPractice.PrimitivesDataType;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
//        int num = 13;
//        boolean isPrime = true;
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime) {
//            System.out.println(num + " is a Prime Number");
//        } else {
//            System.out.println(num + " is not a Prime Number");
//        }


        Scanner number = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int num = number.nextInt();

        int check = 2;

        if (num <= 1){
            System.out.println("neither prime nor composite number");
            return;
        }

        while (check <= Math.sqrt(num)) {
            if (num % check == 0){
                System.out.println(num + " is not a Prime Number");
                break;
            }
            check++;
        }
        if (check > Math.sqrt(num)) {
            System.out.println(num+" is a Prime Number");
        }
    }
}
