package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getXO("xxxooo"));
    }

    public static boolean getXO (String str) {
        int xCounter = 0;
        int oCounter = 0;

        String strToLowerCase = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if(strToLowerCase.charAt(i) == 'x') {
                xCounter++;
            }
            if(strToLowerCase.charAt(i) == 'o') {
                oCounter++;
            }
        }
        return xCounter == oCounter;
    }
}
