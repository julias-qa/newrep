package com.company;

public class MINMAX2 {
    static double[] myArray = {1, 1.4, 20, 0.1, 6.1, 3.6};
    public static void main(String[] args) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            min = Math.min(min, myArray[i]);
        }
        System.out.println("Show min " + min);
    }
}

