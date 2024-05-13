package com.JavaPractice.PrimitivesDataType;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
//        double celsius = 37;
//        double feranhit = (celcius * 9 / 5) + 32;
//        System.out.println("Feranhit = " + feranhit);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius = ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}
