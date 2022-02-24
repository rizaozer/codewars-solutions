package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int [] numbers = {Integer.MAX_VALUE, 0, 1};
        System.out.println(findOddOrEven(numbers));
    }

    public static int findOddOrEven(int[] numbers) {

        int oddCounter = 0;
        int evenCounter = 0;
        int oddIndex = 0;
        int evenIndex = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCounter++;
                evenIndex = number;
            } else {
                oddCounter++;
                oddIndex = number;
            }
        }

        if(evenCounter > 1) {
            return oddIndex;
        } else if(oddCounter > 1) {
            return evenIndex;
        } else {
            System.out.println("Wrong input");
            return -1;
        }

    }
}
