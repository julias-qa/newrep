package com.company;

public class Homework {

    public static void main(String args[]) {
        int[] numbers = new int[50];
        int j = 0; //счетчик элементов в массиве
        for (int i = 1; i <= 99; i++) { // проверяются числа от 1 до 99
            if (i % 2 != 0) { //делит I на 2 и смотрит остаток, если остаток есть - значит if или наоборот
                numbers[j] = i; //в массив намберс кладется значение i с остатком, т.е. нечетные
                System.out.println(numbers[j]);
                j++; //увеличиваем счетчик на 1 для след ячейки

            }
        }
        for (int i = 49; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

    }
}