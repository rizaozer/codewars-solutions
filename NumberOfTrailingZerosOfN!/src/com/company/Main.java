package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(zeros(1000));
    }

    public static int zeros(int number) {

        int counter = 0;
        // find how many powers of 5 in a number
        for (int i = 1; i < Math.log(number) / Math.log(5); i++)
            counter += number / Math.pow(5, i);
        return counter;
    }
}
