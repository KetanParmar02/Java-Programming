package com.JavaPractice.PrimitivesDataType;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your RollNo. :-  ");
        int roll_no = in.nextInt();
        System.out.println("Your RollNo is = "+roll_no);

        System.out.print("Please Enter Your Name : ");
        String name = in.next();
        System.out.println("Hello "+ name);
    }
}
