package com.JavaPractice.Methods;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean ans = isArmstrong(num);
        System.out.println(ans ? num + " is an Armstrong number." : num + " is not an Armstrong number.");

        // print all Armstrong numbers between 1 and 1000
        for (int i = 101; i <= 1000; i++){
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    // check if the number is Armstrong or not
    static boolean isArmstrong(int num){
        int originalNum = num;
        int count = 0;
        int sum = 0;

        // count the number of digits
        while(num != 0){
            num /= 10;
            count++;
        }

        num = originalNum;

        // calculate the sum of the power of each digit
        while(num != 0){
            int digit = num % 10;
            sum += (int) Math.pow(digit, count);
            num /= 10;
        }
        return sum == originalNum;
    }
}
