package com.JavaPractice.Condition_and_Loops;

import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {

        // Give this Character is UpperCase or LowerCase
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Character = ");
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("This Character is LowerCase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("This Character is UpperCase");
        }else {
            System.out.println("This Character is not an Alphabet");
        }
    }
}
