package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(multipliers(10));
    }

    public static int multipliers(int number) {
        if(number < 0) {
            return 0;
        }

        // Divide all numbers with remainder operator lower than number with 3
        // Divide all numbers with remainder operator lower than number with 5
        // if number is divisible without remainder than add to sum
        // return sum

        int sum = 0;
        for (int i = 0; i < number; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
