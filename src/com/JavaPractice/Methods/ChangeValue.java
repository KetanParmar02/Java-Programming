package com.JavaPractice.Methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeValue(int[] arr) {
        arr[0] = 99; // if you make a change to the object via this reference variable, the change will be reflected in the original object
    }
}
