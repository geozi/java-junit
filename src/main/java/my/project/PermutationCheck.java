package my.project;

import java.util.Arrays;

/**
 * The {@link PermutationCheck} class contains
 * a static method that checks whether two strings
 * are permutations of one another.
 */
public class PermutationCheck {

    /**
     * Checks if two strings are permutations of
     * one another.
     * @param s1 A string.
     * @param s2 A string.
     * @return True if the strings are permutations of one another, false otherwise.
     */
    static boolean arePermutations(String s1, String s2) {
        boolean result = true;

        if(s1.length() != s2.length()) {
            result = false;
        } else {
            char[] chars1 = s1.toCharArray();
            char[] chars2 = s2.toCharArray();

            Arrays.sort(chars1);
            Arrays.sort(chars2);

            for(int i =0; i < chars1.length; i++) {
                if(chars1[i] != chars2[i]) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
}
