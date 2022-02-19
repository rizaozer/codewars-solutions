package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Maskify1("564898732213"));
        System.out.println(Maskify2("564898732213"));
    }

    // solution by using string builder
    public static String Maskify1(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if(str.length() < 4) {
            System.out.println(str);
        } else {
            stringBuilder.append("#".repeat(str.length() - 4));
            stringBuilder.append(str.substring(str.length() - 4));
        }
        return new String(stringBuilder);
    }

    // solution by using regex
    public static String Maskify2(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
}
