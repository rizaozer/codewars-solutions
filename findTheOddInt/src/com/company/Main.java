package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] inputNumbers = {1,1,1,1,1,1,10,1,1,1,1};
        System.out.println("Sorted Array: " + Arrays.toString(bubbleSort(inputNumbers)));
        System.out.println(findIt(inputNumbers));
    }

    // which number occurs odd number of times
    public static int findIt(int[] numbers) {

        int counter = 1;
        int number = 0;
        bubbleSort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {

            if (counter % 2 != 0 && counter != 1 && numbers[i] != numbers[i + 1]) {
                System.out.println("return " + number + " counter " + counter);
                return number;
            }

            if (numbers[i] == numbers[i + 1]) {
                counter++;
                number = numbers[i];
                System.out.println("inside " + number + " counter " + counter);
            } else {
                counter = 1;
            }

        }
        return -1;
    }

    public static int[] bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if(numbers[j + 1] < numbers[j]) {
                    swap(j, j + 1, numbers);
                }
            }
        }
        return numbers;
    }

    public static void swap(int firstIndex, int secondIndex, int[] numbers) {
        int temp = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = temp;
    }

    public class FindOdd {
        public static int findIt(int[] a) {
            int k = 0;
            int t = 0;

            for (int i = 0; i < a.length; i++) {
                t = a[i];

                for (int j = 0; j < a.length; j++) {
                    if (a[j] == t) {
                        k++;
                    }
                }

                if (k % 2 != 0) {
                    return t;
                }
            }
            return 0;
        }
    }

}
