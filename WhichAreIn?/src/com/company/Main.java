package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        String[] a = new String[]{ "arp", "live", "strong" };
        String[] b = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };

        String[] r = new String[] { "arp", "live", "strong" };

        System.out.println(inArray(a, b));
    }

    public static HashSet<String> inArray(String[] array1, String[] array2) {

        HashSet<String> included = new HashSet<>();

        for (String s : array1) {

            for (String value : array2) {

                for (int k = 0; k < value.length(); k++) {
                    if (value.substring(k).equals(s)) {
                        included.add(s);
                    }
                }
            }
        }
        return included;
    }


        public static String[] innArray(String[] array1, String[] array2) {
            return Arrays.stream(array1)
                    .filter(str ->
                            Arrays.stream(array2).anyMatch(s -> s.contains(str)))
                    .distinct()
                    .sorted()
                    .toArray(String[]::new);
        }


}
