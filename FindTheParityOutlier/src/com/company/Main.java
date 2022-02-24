package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int [] numbers = {160, 3, 1719, 19, 11, 13, -21};
        System.out.println(findOddOrEven(numbers));
    }

    public static int findOddOrEven(int[] numbers) {

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        if(evenNumbers.size() == 1) {
            return evenNumbers.get(0);
        } else if(oddNumbers.size() == 1) {
            return oddNumbers.get(0);
        } else {
            System.out.println("Wrong input");
            return -1;
        }

    }
}
