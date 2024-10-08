package my.project;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Return-value tests.
 * The isPalindrome(str: String) method returns
 * true if a string is palindromic, false otherwise.
 * The tests are developed per outcome and per input.
 */
class PalindromicityCheckTest {

    @Test
    @DisplayName("Testing isPalindrome(str: String): palindromic string")
    void checkWithPalindromicString() {
        // Arrange
        String str = "madam";

        // Act
        boolean evalResult = PalindromicityCheck.isPalindrome(str);

        // Assert
        assertAll( "Failure in testing isPalindrome(str: String) with a palindromic string",
                () -> assertNotNull(str),
                () -> assertTrue(evalResult)
        );
    }

    @Test
    @DisplayName("Testing isPalindrome(str: String): non-palindromic string")
    void checkWithNonPalindromicString() {
        // Arrange
        String str = "morning";

        // Act
        boolean evalResult = PalindromicityCheck.isPalindrome(str);

        // Assert
        assertAll(
                "Failure in testing isPalindrome(str: String) with a non-palindromic string",
                () -> assertNotNull(str),
                () -> assertFalse(evalResult)
        );
    }

    @Test
    @DisplayName("Testing isPalindrome(str: String): string with only whitespaces")
    void checkWithOnlyWhiteSpacesString() {
        // Arrange
        String str = "    ";

        // Act
        boolean evalResult = PalindromicityCheck.isPalindrome(str);

        // Assert
        assertAll(
                "Failure in testing isPalindrome(str: String) with only whitespaces",
                () -> assertNotNull(str),
                () -> assertTrue(evalResult)
        );
    }

    @Test
    @DisplayName("Testing isPalindrome(str: String): null value")
    void checkWithNullValue() {
        // Arrange
        String str = null;

        // Act and assert
        assertAll(
                "Failure in testing isPalindrome(str: String) with a null value",
                () -> assertThrows(NullPointerException.class, () -> {
                    boolean evalResult = PalindromicityCheck.isPalindrome(str);
                })
        );

    }

    @Test
    @DisplayName("Testing isPalindrome(str: String): empty string")
    void checkWithEmptyString() {
        // Arrange
        String str = "";

        // Act
        boolean evalResult = PalindromicityCheck.isPalindrome(str);

        // Act and assert
        assertAll(
                "Failure in testing isPalindrome(str: String) with an empty string",
                () -> assertNotNull(str),
                () -> assertFalse(evalResult)
        );
    }
}