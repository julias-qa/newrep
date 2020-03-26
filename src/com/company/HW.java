package com.company;

public class HW {

    public static void main(String args[]) {
        print(50);
        print(100);
    }

    public static void  print(int i) {

        while ( i >= 10){
            System.out.println( "show me " + i);
            i-=10;
        }
        System.out.println();
    }
}