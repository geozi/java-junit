package my.project;

/**
 * The {@link LeadingAndTrailingWhitespaceRemoval} class
 * contains methods that remove front and trailing
 * whitespaces.
 */
public class LeadingAndTrailingWhitespaceRemoval {

    // Auxiliary methods

    /**
     * Counts the number of front whitespaces.
     * @param str A string.
     * @return The number of front whitespaces contained in the string.
     */
    private static int countFrontWhitespaces(String str) {
        int count = 0;
        int i =0;

        while( i < str.length() && str.charAt(i) == ' ') {
            count++;
            i++;
        }

        return count;
    }

    /**
     * Counts the number of trailing whitespaces.
     * @param str A string.
     * @return The number of trailing whitespaces contained in the string.
     */
    private static int countTrailingWhitespaces(String str) {
        int count = 0;
        int i = str.length()-1;

        while(i >= 0 && str.charAt(i) == ' ') {
            count++;
            i--;
        }

        return count;
    }

    // Public APIs

    /**
     * Removes the front whitespaces from a string.
     * @param str A string.
     * @return A copy of the string without front whitespaces.
     */
    static String removeFrontWhitespaces(String str) {
        int whitespaceCount = countFrontWhitespaces(str);
        return str.substring(whitespaceCount);
    }

    /**
     * Removes the trailing whitespaces from a string.
     * @param str A string.
     * @return A copy of the string without trailing whitespaces.
     */
    static String removeTrailingWhitespaces(String str) {
        int whitespaceCount = countTrailingWhitespaces(str);
        return str.substring(0, str.length() - whitespaceCount);
    }

}
