package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(makeComplement("GTAT"));
    }
    // "ATTGC" --> "TAACG"
    //"GTAT" --> "CATA"

    // A -> T
    // C -> G

    public static String makeComplement(String dna) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            if(dna.charAt(i) == 'A') {
                stringBuilder.append('T');
            }
            if(dna.charAt(i) == 'T') {
                stringBuilder.append('A');
            }

            if(dna.charAt(i) == 'G') {
                stringBuilder.append('C');
            }
            if(dna.charAt(i) == 'C') {
                stringBuilder.append('G');
            }
        }
        return stringBuilder.toString();
    }
}
