package com.company;

import java.util.Arrays;

public class SUM {
      public static void main(String[] args) {

        double total = getSum(MINMAX.myArray)+getSum(MINMAX2.myArray);
        System.out.println("SUM " + total);

    }

    private static double getSum(double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }
}
