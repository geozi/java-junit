package my.project;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * The {@link PalindromicityCheck} class
 * contains a boolean method that checks
 * whether a string is palindromic.
 */
public class PalindromicityCheck {

    /**
     * Creates a stack with the characters
     * of a string.
     * @param str A string
     * @return A character stack.
     */
     private static Deque<Character> createStack(String str) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i =0; i < str.length(); i++) {
            stack.addFirst(str.charAt(i));
        }

        return stack;
    }

    /**
     * Checks whether a string is a palindrome.
     * @param str The string to be checked.
     * @return true if the string is palindromic, false otherwise.
     */
    static boolean isPalindrome(String str) {

        boolean evalResult = true;

        if(str.isEmpty()) {
            evalResult = false;
        } else {
            Deque<Character> stack = createStack(str);
            for(int i =0; i < str.length(); i++) {
                if(str.charAt(i) != stack.pop()) {
                    evalResult = false;
                    break;
                }
            }
        }

        return evalResult;

    }
}
