package com.JavaPractice.PrimitivesDataType;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Automatic Type Casting
        // Wide casting
        Float num = in.nextFloat();
        System.out.println(num);

        // Explicitly Type Casting
        // Narrow Casting
        int num1 = (int) (67.8736489);
        System.out.println(num1);

        // Automatic Type Promotion rule
        short a = 46;
        short b = 78;
        int ans = (a*b) / 100;
        System.out.println(ans);

        // type casting & type promotion rule
        /*
                1 -> all two type should be compatible Source & Destination
                2 -> Destination type should be > Source type
                3 -> JAVA Supports the UNICODE Principle
         */
        System.out.println("नमस्ते करने के लिए, दोनो हाथों को अनाहत चक पर रखा जाता है, आँखें बंद की जाती हैं और सिर को झुकाया जाता है। इसके अलावा\n" +
                "\n" +
                "पहले अपने मन को एक गहरी सांस के साथ शांत करें।\n" +
                "सांस छोड़ते या सांस छोड़ते हुए हथेलियों को चेस्ट के सामने लाएं।\n" +
                "हथेलियों को थोड़ा दबाएं। आपकी उंगलियां ऊपर की ओर होनी चाहिए और अंगूठे को छाती से स्पर्श करना चाहिए।\n" +
                "कमर से थोड़ा झुकें और उसी समय गर्दन को थोड़ा झुकाएँ।\n" +
                "और फिर नमस्ते कहें। नमस्ते को ना-मा-स्ते के रूप में उच्चारण करें।\n" +
                "सिर झुकाकर और हाथों को हृदय के पास लाकर भी नमस्ते किया जा सकता है। दूसरी विधि गहरे आदर का सूचक है।");
    }
}
