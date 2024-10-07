package my.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Return-value tests.
 * The arePermutations(s1: String, s2: String) method
 * returns true if the 2 strings are permutations of one
 * another or false otherwise. It throws a NullPointerException.
 * The tests are developed per outcome and per input.
 */
class PermutationCheckTest {

    @Test
    @DisplayName("Testing arePermutations(s1: String, s2: String): valid letter strings with same length")
    void areValidSameLengthLetterStringsPermutations() {
        // Arrange
        String s1 = "listen";
        String s2 = "silent";

        // Act
        boolean result = PermutationCheck.arePermutations(s1, s2);

        // Assert
        assertAll(
                "Failure in testing valid letter strings with same length",
                () -> assertNotNull(s1),
                () -> assertNotNull(s2),
                () -> assertEquals(s1.length(), s2.length()),
                () -> assertTrue(result)
        );
    }

    @Test
    @DisplayName("Testing arePermutations(s1: String, s2: String): invalid letter strings with same length")
    void areInvalidSameLengthLetterStringsPermutations() {

        // Arrange
        String s1 = "hello";
        String s2 = "world";

        // Act
        boolean result = PermutationCheck.arePermutations(s1, s2);

        // Assert
        assertAll(
                "Failure in testing invalid letter strings with same length",
                () -> assertNotNull(s1),
                () -> assertNotNull(s2),
                () -> assertEquals(s1.length(), s2.length()),
                () -> assertFalse(result)
        );
    }

    @Test
    @DisplayName("Testing arePermutations(s1: String, s2: String): valid integer strings with same length")
    void areValidSameLengthIntegerStringsPermutations() {
        // Arrange
        String s1 = "12345";
        String s2 = "45321";

        // Act
        boolean result = PermutationCheck.arePermutations(s1, s2);

        // Assert
        assertAll(
                "Failure in testing valid integer strings with same length",
                () -> assertNotNull(s1),
                () -> assertNotNull(s2),
                () -> assertEquals(s1.length(), s2.length()),
                () -> assertTrue(result)
        );
    }

    @Test
    @DisplayName("Testing arePermutations(s1: String, s2: String): invalid integer strings with same length")
    void areInvalidSameLengthIntegerStringsPermutations() {
        // Arrange
        String s1 = "12345";
        String s2 = "65321";

        // Act
        boolean result = PermutationCheck.arePermutations(s1, s2);

        // Assert
        assertAll(
                "Failure in testing invalid integer strings with same length",
                () -> assertNotNull(s1),
                () -> assertNotNull(s2),
                () -> assertEquals(s1.length(), s2.length()),
                () -> assertFalse(result)
        );
    }

    @Test
    @DisplayName("Testing arePermutations(s1: String, s2: String): valid mixed strings with same length")
    void areValidSameLengthMixedStringsPermutations() {
        // Arrange
        String s1 = "#random123*";
        String s2 = "123random#*";

        // Act
        boolean result = PermutationCheck.arePermutations(s1, s2);

        // Assert
        assertAll(
                "Failure in testing valid mixed strings with same length",
                () -> assertNotNull(s1),
                () -> assertNotNull(s2),
                () -> assertEquals(s1.length(), s2.length()),
                () -> assertTrue(result)
        );
    }

    @Test
    @DisplayName("Testing arePermutations(s1: String, s2: String): invalid mixed strings with same length")
    void areInvalidSameLengthMixedStringsPermutations() {
        // Arrange
        String s1 = "#randomNumber24*";
        String s2 = "##randomNumber24";

        // Act
        boolean result = PermutationCheck.arePermutations(s1, s2);

        // Assert
        assertAll(
                "Failure in testing invalid mixed strings with same length",
                () -> assertNotNull(s1),
                () -> assertNotNull(s2),
                () -> assertEquals(s1.length(), s2.length()),
                () -> assertFalse(result)
        );
    }

    @Test
    @DisplayName("Testing arePermutations(s1: String, s2: String): strings with different lengths")
    void areStringsWithDifferentLengthsPermutations() {
        // Arrange
        String s1 = "apple";
        String s2 = "apples";

        // Act
        boolean result = PermutationCheck.arePermutations(s1, s2);

        // Assert
        assertAll(
                "Failure in testing strings with different lengths",
                () -> assertNotNull(s1),
                () -> assertNotNull(s2),
                () -> assertNotEquals(s1.length(), s2.length()),
                () -> assertFalse(result)
        );
    }

    @Test
    @DisplayName("Testing arePermutations(s1: String, s2: String): empty strings")
    void areEmptyStringsPermutations() {
        // Arrange
        String s1 = "";
        String s2 = "";

        // Act
        boolean result = PermutationCheck.arePermutations(s1, s2);

        // Assert
        assertAll(
                "Failure in testing empty strings",
                () -> assertNotNull(s1),
                () -> assertNotNull(s2),
                () -> assertTrue(result)
        );
    }

    @Test
    @DisplayName("Testing arePermutations(s1: String, s2: String): null values")
    void areNullValuesPermutations() {
        // Arrange
        String s1 = null;
        String s2 = null;

        // Act and Assert
        assertAll(
                "Failure in testing null values",
                () -> assertNull(s1),
                () -> assertNull(s2),
                () -> assertThrows(NullPointerException.class, () -> {
                    boolean result = PermutationCheck.arePermutations(s1,s2);
                })
        );
    }
}