package my.project;

/**
 * The {@link WordAndPhraseReversal} class
 * contains methods that reverse the letters of
 * a word as well as the order of the words in a
 * phrase.
 */
public class WordAndPhraseReversal {

    /**
     * Reverses the order of characters in a string.
     * @param token A one-word string.
     * @return The reverse version of the one-word string.
     */
    private static String reverseLetters(String token) {
        int n = token.length();
        StringBuilder reversedToken = new StringBuilder();
        for(int i = n-1; i >=0; i--) {
            reversedToken.append(token.charAt(i));
        }

        return reversedToken.toString();
    }

    /**
     * Reverses the order of words in phrase.
     * @param str A multi-word string.
     * @return The reverse version of the multi-word string.
     */
    static String reversePhrase(String str) {
        String[] phraseTokens;
        StringBuilder reversedPhrase = new StringBuilder();

        if(str.contains(" ")) {
            phraseTokens = str.split("(?<=\\s)|(?=\\s)");
            for(int i = phraseTokens.length - 1; i >= 0; i--) {
                reversedPhrase.append(reverseLetters(phraseTokens[i]));
            }
        } else {
            reversedPhrase.append(reverseLetters(str));
        }

        return reversedPhrase.toString();
    }
}
