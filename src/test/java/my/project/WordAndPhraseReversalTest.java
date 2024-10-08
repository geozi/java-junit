package my.project;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Return-value tests.
 * The reversePhrase(str: String) method always returns a String
 * or throws a NullPointerException. The tests are developed
 * per input.
 */
class WordAndPhraseReversalTest {

    @Test
    @DisplayName("Testing reversePhrase(str: String): a string with letter characters")
    void reverseStringWithLetterCharacters() {
        // Arrange
        String str = "hello";

        // Act
        String reversedStr = WordAndPhraseReversal.reversePhrase(str);

        // Assert
        assertAll("Failure in testing reversePhrase(str: String) with letter characters",
                () -> assertNotNull(reversedStr),
                () -> assertFalse(reversedStr.isEmpty()),
                () -> assertEquals("olleh", reversedStr));
    }

    @Test
    @DisplayName("Testing reversePhrase(str: String): a sequence of numbers")
    void reverseStringWithNumberSequence() {
        // Arrange
        String str = "0123456789";


        // Act
        String reversedStr = WordAndPhraseReversal.reversePhrase(str);

        // Assert
        assertAll(
                "Failure in testing reversePhrase(str: String) with numbers",
                () -> assertNotNull(reversedStr),
                () -> assertFalse(reversedStr.isEmpty()),
                () -> assertEquals("9876543210", reversedStr)
        );
    }

    @Test
    @DisplayName( "Testing reversePhrase(str: String): string with letters and whitespaces")
    void reverseStringWithLettersAndWhitespaces() {
        // Arrange
        String str = "This is a phrase";

        // Act
        String reversedStr = WordAndPhraseReversal.reversePhrase(str);

        // Assert
        assertAll("Failure in testing reversePhrase(str: String) with letters and whitespaces",
                () -> assertNotNull(reversedStr),
                () -> assertFalse(reversedStr.isEmpty()),
                () -> assertEquals("esarhp a si sihT", reversedStr)

        );
    }

    @Test
    @DisplayName("Testing reversePhrase(str: String): string with letters, whitespaces, and commas")
    void reverseStringWithLettersWhitespacesAndCommas() {
        // Arrange
        String str = "This phrase, although not very big, has commas";

        // Act
        String reversedStr = WordAndPhraseReversal.reversePhrase(str);

        // Assert
        assertAll("Failure in testing reversePhrase(str: String) with letters, whitespaces, and commas",
                () -> assertNotNull(reversedStr),
                () -> assertFalse(reversedStr.isEmpty()),
                () -> assertEquals("sammoc sah ,gib yrev ton hguohtla ,esarhp sihT", reversedStr)
        );
    }

    @Test
    @DisplayName("Testing reversePhrase(str: String): empty string")
    void reverseEmptyString() {
        // Arrange
        String str = "";

        // Act
        String reversedStr = WordAndPhraseReversal.reversePhrase(str);

        // Assert
        assertAll("Failure in testing reversePhrase(str: String) with empty string",
                () -> assertNotNull(reversedStr),
                () -> assertTrue(reversedStr.isEmpty())
        );
    }

    @Test
    @DisplayName("Testing reversePhrase(str: String): null value")
    void reverseNullString() {
        // Arrange
        String str = null;

        // Act and Assert
        assertAll("Failure in testing reversePhrase(str: String) will null value",
                () -> assertNull(str),
                () -> assertThrows(NullPointerException.class, () -> {String reversedStr = WordAndPhraseReversal.reversePhrase(str);})
                );
    }

}