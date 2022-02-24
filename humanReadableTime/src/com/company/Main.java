package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(makeReadable(121212));
        // 33:11:22

    }

    public static String makeReadable(int seconds) {

        int second = seconds % 60; // find seconds
        int minutes = seconds / 60; // convert seconds to minutes
        int minute = minutes % 60; // find minutes
        int hour = minutes / 60; // find hours


        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
