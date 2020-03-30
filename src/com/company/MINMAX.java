package com.company;

public class MINMAX {
    static double[] myArray = {10, 15, 20, 25, 56.1, 3.6};
    public static void main(String[] args) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            max = Math.max(max, myArray[i]);
        }
        System.out.println("Show Max: " + max);
    }
}

