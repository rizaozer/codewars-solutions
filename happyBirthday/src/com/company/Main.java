package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(wrap(17,32,11));
    }

    public static int wrap(int height, int width, int length) {

        if (height <= 0 || width <= 0 || length <= 0) {
            return 0;
        }

        return (height + width + length + Math.min(Math.min(width, height), length)) * 2 + 20;
    }
}
