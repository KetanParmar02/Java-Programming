package com.JavaPractice.PrimitivesDataType;

public class TypeCastingExample {
    public static void main(String[] args) {
        short a = 54;
        byte b = 83;
        char ch = 'a';
        int c = 34;
        float d = 743.8329f;
        double e = 437.8329;
        long f = 437863543L;

        // this example for type casting & conversion
        double ans = (a*d) + (b / a) + (c + ch) - (e+d) + (f - a);
        System.out.println((a*d)+" "+(b / a)+" "+(c + ch) +" "+(e+d)+" "+(f - a));
        System.out.println(ans);
    }
}
