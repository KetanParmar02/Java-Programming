package com.JavaPractice.Methods;

public class Scope {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        {
            int y = 20;
            System.out.println(y);
        }
        // System.out.println(y); // y is not in scope

        // block scope
        {
            x = 100;
        }

        /*
            1 -> if any variable is declared inside a block, it is only accessible within that block & also you can change that reference variable value in that scope & also you can redeclare out side the block.
            2 -> if you declare a variable outside the block, you can access that variable inside the block.
         */

        System.out.println(x);

        // System.out.println(y); // y is not in scope
        {
            int c = 30;
            System.out.println(c);
        }

        // System.out.println(c); // c is not in scope
        int c = 40;
        System.out.println(c);
    }
}
