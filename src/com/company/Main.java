package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // #1
        //System.out.println("Задача №1");
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
        System.out.println("\nЗадача №2");
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;

        System.out.println("Total weight of both boxers is " + (firstBoxerWeight + secondBoxerWeight) + " kilos.");
        System.out.println("Weight difference is " + Math.abs(firstBoxerWeight - secondBoxerWeight) + " kilos.");

        // #3
        System.out.println("\nЗадача №3");
        int bananasNumber = 5;
        int milkVolumeMl = 200;
        int iceCreamPacksNumber = 2;
        int eggsNumber = 4;

        int bananaWeight = 80;
        int milkWeight = 105 / 100;
        int iceCreamWeight = 100;
        int eggWeight = 80;

        int breakfastWeight = bananasNumber * bananaWeight +
                milkVolumeMl * milkWeight +
                iceCreamPacksNumber * iceCreamWeight +
                eggsNumber * eggWeight;

        System.out.println("Total weight of the breakfast is " + breakfastWeight + " g.");
        System.out.println("Total weight of the breakfast is " + breakfastWeight / 1000f + " kg.");

        // #4
        System.out.println("\nЗадача №4");
        int overweight = 7;
        int minWeightLossADayGram = 250;
        int maxWeightLossADayGram = 500;

        int maxDaysToLooseOverweight = overweight * 1000 / minWeightLossADayGram;
        int minDaysToLooseOverweight = overweight * 1000 / maxWeightLossADayGram;
        int averageDaysToLooseOverweight = (minDaysToLooseOverweight + maxDaysToLooseOverweight) / 2;

        System.out.println("Loosing your extra " + overweight + " kilos will take you:");
        System.out.println( "- at min " + minDaysToLooseOverweight + " days,");
        System.out.println( "- at max " + maxDaysToLooseOverweight + " days,");
        System.out.println( "or " + averageDaysToLooseOverweight + " days on average.");

        // #5
        System.out.println("\nЗадача №5");
        int mashaMonthlyRate = 67760;
        int dennisMonthlyRate = 83690;
        int christineMonthlyRate = 76230;

        int rateChangedByPercent = 10;
        int calcCycleMonths = 12;

        int mashaUpdatedRate = mashaMonthlyRate * (1 + rateChangedByPercent / 100);
        int dennisUpdatedRate = dennisMonthlyRate * (1 + rateChangedByPercent / 100);
        int christineUpdatedRate = christineMonthlyRate * (1 + rateChangedByPercent / 100);

        int mashaRaisePerCalcCycle = mashaMonthlyRate * calcCycleMonths * rateChangedByPercent / 100;
        int dennisRaisePerCalcCycle = dennisMonthlyRate * calcCycleMonths * rateChangedByPercent / 100;
        int christineRaisePerCalcCycle = christineMonthlyRate * calcCycleMonths * rateChangedByPercent / 100;

        System.out.println("Masha's is getting " + mashaUpdatedRate + " rubles monthly now.\nTheir annual income increased by " + mashaMonthlyRate + " rubles.");
        System.out.println("Dennis's is getting " + dennisUpdatedRate + " rubles monthly now.\nTheir annual income increased by " + dennisMonthlyRate + " rubles.");
        System.out.println("Christine's is getting " + christineUpdatedRate + " rubles monthly now.\nTheir annual income increased by " + christineMonthlyRate + " rubles.");
    }
}