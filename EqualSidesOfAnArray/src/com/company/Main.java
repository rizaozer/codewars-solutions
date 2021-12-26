package com.company;

public class Main {

    public static void main(String[] args) {
	    int [] numbers = {1,2,3,4,5,6};
        System.out.println(findEvenIndex(numbers));
    }

    public static int findEvenIndex(int[] arr) {

        if(arr.length == 0) {
            return -1;
        }

        int sumLeft;
        int sumRight;
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            sumLeft = 0;
            sumRight = 0;

            for (int j = i + 1; j < arr.length; j++) {
                sumRight = sumRight + arr[j];
            }

            // this code will run only for the first loop
            if(flag) {
                flag = false;
                if(sumRight == 0) {
                    return 0;
                }
            }

            for (int j = 0; j < i; j++) {
                sumLeft = sumLeft + arr[j];
            }

            if(sumRight == sumLeft) {
                return i;
            }
        }
        return -1;
        }
    }
