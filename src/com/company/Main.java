package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // #1
        // variable type
        var a = 100;

        // integers
        byte b = -128; // 1 byte
        short s = 32767; // 2 bytes
        int i = -2147483648; // 4 bytes
        long l = 0L; // 8 bytes

        // fractions
        float f = -1.75f; // 4 bytes
        double d = 1.01; // 8 bytes

        // characters
        char c = 'C'; // 2 bytes

        //boolean
        boolean boo = false; // 1 bit

        // #2
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;

        System.out.println("Total weight of both boxers is " + (boxer1 + boxer2) + " kilos.");
        System.out.println("Weight difference is " + Math.abs(boxer1 - boxer2) + " kilos.");

        // #3
        int banana = 5;
        int milk = 200;
        int iceCream = 2;
        int egg = 4;
        int breakfast;

        breakfast = banana * 80 + milk / 100 * 105 + iceCream * 100 + egg * 80;

        System.out.println("Total weigt of the breakfast if " + breakfast + " g.");

        // #4
        int overweight = 7;
        int lowerLimit = 250;
        int upperLimit = 500;

        System.out.println("Weight loss will take from " + (float) overweight * 1000 / upperLimit + " to " + (float) overweight * 1000 / lowerLimit + " days.");

        // #5
        int masha = 67760;
        int dennis = 83690;
        int christine = 76230;

        System.out.println("Masha's is getting " + masha * 1.1 + " rubles monthly now. Their annual income increased by " + masha * 12 * .1 + " rubles.");
        System.out.println("Dennis's is getting " + dennis * 1.1 + " rubles monthly now. Their annual income increased by " + dennis * 12 * .1 + " rubles.");
        System.out.println("Christine's is getting " + christine * 1.1 + " rubles monthly now. Their annual income increased by " + christine * 12 * .1 + " rubles.");
    }
}