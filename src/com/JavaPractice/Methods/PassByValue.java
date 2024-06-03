package com.JavaPractice.Methods;

public class PassByValue {
    public static void main(String[] args) {
        String name = "John";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "Jane";
    }


}
