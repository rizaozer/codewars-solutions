package com.company;

public class Main {

    public static void main(String[] args) {
        int [] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sequence(numbers));
    }

    public static int sequence(int[] numbers) {

        int max = 0;
        // find the pair with the highest sum find
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] + numbers[i + 1] > max) {
                max = numbers[i] + numbers[i + 1];
            }
        }

        return max;
    }

    public class Max {
        public static int sequence(int[] arr) {

            int sum = 0, tempSum = 0;

            for (int current : arr) {

                if(tempSum + current > 0) {
                    tempSum = tempSum + current;
                } else {
                    tempSum = 0;
                }

                if(tempSum > sum) {
                    sum = tempSum;
                }

            }
            return sum;
        }
    }


    public class Max2 {

        // [-2, 1, -3, 4, -1, 2, 1, -5, 4]

        // [4, -1, 2, 1]

        public static int sequence(int[] arr) {
            int sum=0;
            int temp;

            for (int i = 0; i < arr.length - 1; i++) {
                temp = arr[i] + arr[i + 1]; // temp = 3 // temp = 1

                for (int j = i + 2; j < arr.length; j++) {
                    temp += arr[j]; // temp = 5 // temp = 6 // temp = 2
                    if (sum < temp) {
                        sum = temp; // sum = 5 // temp = 6
                    }
                }
            }
            return sum;
        }
    }
}


