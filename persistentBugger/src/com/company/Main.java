package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(digitMultiplication(39));
    }

    public static int digitMultiplication(int number) {

        int counter = 0; int temp; int temp2;
        while(number > 9) {
            counter++;
            temp2 = 1;
            while (number > 0) {
                temp = number % 10;
                number = number / 10;
                temp2 = temp2 * temp;
            }
            number = temp2;
        }
        return counter;
    }
}
