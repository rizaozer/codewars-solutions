package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        System.out.println(decode("...−−−..."));
    }

    public static String decode(String morseCodeText) {
        morseCodeText = morseCodeText.trim();
        Map<String, String> morse;
        morse = addMorse();

        //split words to array
        String[] words = morseCodeText.split("   ");

        // create a sentence with words
        StringJoiner sentence = new StringJoiner(" ");

        //for loop for words
        for (int i = 0; i < words.length; i++) {

            StringBuilder myWord = new StringBuilder();
            //split morse letters to array
            String[] word = words[i].split(" ");
            System.out.println(Arrays.toString(word));

            // for loop for every word
            for (int j = 0; j < word.length; j++) {
                System.out.println(morse.get(word[j]));
                myWord.append(morse.get(word[j]));
            }
            sentence.add(myWord);
        }


        // Extra spaces before or after the code have no meaning and should be ignored. +
        // Split words to array
        // Split morse letters to array
        // Convert morse to alphabet

        return sentence.toString().toUpperCase();
    }

    public static Map<String, String> addMorse() {
        Map<String, String> morseCode = new HashMap<>();
        morseCode.put(".-", "a");
        morseCode.put("-...", "b");
        morseCode.put("-.-.", "c");
        morseCode.put("-..", "d");
        morseCode.put(".", "e");
        morseCode.put("..-.", "f");
        morseCode.put("--.", "g");
        morseCode.put("....", "h");
        morseCode.put("..", "i");
        morseCode.put(".---", "j");
        morseCode.put("-.-", "k");
        morseCode.put(".-..", "l");
        morseCode.put("--", "m");
        morseCode.put("-.", "n");
        morseCode.put("---", "o");
        morseCode.put(".--.", "p");
        morseCode.put("--.-", "q");
        morseCode.put(".-.", "r");
        morseCode.put("...", "s");
        morseCode.put("-", "t");
        morseCode.put("..-", "u");
        morseCode.put("...-", "v");
        morseCode.put(".--", "w");
        morseCode.put("-..-", "x");
        morseCode.put("-.--", "y");
        morseCode.put("--..", "z");
        morseCode.put("-----", "0");
        morseCode.put(".----", "1");
        morseCode.put("..---", "2");
        morseCode.put("...--", "3");
        morseCode.put("....-", "4");
        morseCode.put(".....", "5");
        morseCode.put("-....", "6");
        morseCode.put("--...", "7");
        morseCode.put("---..", "8");
        morseCode.put("----.", "9");
        morseCode.put("-.-.--", "!");
        morseCode.put("...−−−...", "SOS");
        morseCode.put(".-.-.-", ".");
        return morseCode;
    }


}
