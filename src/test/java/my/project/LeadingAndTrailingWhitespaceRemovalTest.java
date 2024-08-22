package my.project;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Return-value tests.
 * The removeFrontWhitespaces(str: String) and
 * removeTrailingWhitespaces(str: String) methods
 * always return a String or throw a NullPointerException.
 * The development of tests is based on the provided inputs.
 */
class LeadingAndTrailingWhitespaceRemovalTest {

    @Test
    @DisplayName("Testing front whitespace removal: string with one front whitespace")
    void removeFrontWhitespace() {
        // Arrange
        String str = " morning";

        // Act
        String nwcStr = LeadingAndTrailingWhitespaceRemoval.removeFrontWhitespaces(str);

        // Assert
        assertAll(
                "Failure in testing front whitespace removal with one whitespace",
                () -> assertNotNull(nwcStr),
                () -> assertFalse(nwcStr.isEmpty()),
                () -> assertEquals("morning", nwcStr)
        );
    }

    @Test
    @DisplayName("Testing front whitespace removal: string with multiple front whitespaces")
    void removeMultipleFrontWhitespaces() {
        // Arrange
        String str = "   afternoon";

        // Act
        String nwcStr = LeadingAndTrailingWhitespaceRemoval.removeFrontWhitespaces(str);

        // Assert
        assertAll(
                "Failure in testing front whitespace removal with multiple whitespaces",
                () -> assertNotNull(nwcStr),
                () -> assertFalse(nwcStr.isEmpty()),
                () -> assertEquals("afternoon", nwcStr)
        );
    }

    @Test
    @DisplayName("Testing trailing whitespace removal: string with one trailing whitespace")
    void removeTrailingWhitespace() {
        // Arrange
        String str ="word ";

        // Act
        String nwcStr = LeadingAndTrailingWhitespaceRemoval.removeTrailingWhitespaces(str);

        // Assert
        assertAll(
                "Failure in testing trailing whitespace removal with one whitespace",
                () -> assertNotNull(nwcStr),
                () -> assertFalse(nwcStr.isEmpty()),
                () -> assertEquals("word", nwcStr)
        );
    }

    @Test
    @DisplayName("Testing trailing whitespace removal: string with multiple trailing whitespaces")
    void removeMultipleTrailingWhitespaces() {
        // Arrange
        String str = "whitespaces   ";

        // Act
        String nwcStr = LeadingAndTrailingWhitespaceRemoval.removeTrailingWhitespaces(str);

        // Assert
        assertAll(
                "Failure in testing trailing whitespace removal with multiple whitespaces",
                () -> assertNotNull(nwcStr),
                () -> assertFalse(nwcStr.isEmpty()),
                () -> assertEquals("whitespaces", nwcStr)
        );
    }

    @Test
    @DisplayName("Testing front and trailing whitespace removal: string with one front and one trailing whitespace")
    void removeFrontAndTrailingWhitespace() {
        // Arrange
        String str = " phrase ";

        // Act
        String temp = LeadingAndTrailingWhitespaceRemoval.removeFrontWhitespaces(str);
        String nwcStr = LeadingAndTrailingWhitespaceRemoval.removeTrailingWhitespaces(temp);

        // Assert
        assertAll(
                "Failure in testing front and trailing whitespace removal with one front and one trailing whitespace",
                () -> assertNotNull(nwcStr),
                () -> assertFalse(nwcStr.isEmpty()),
                () -> assertEquals("phrase", nwcStr)
        );
    }

    @Test
    @DisplayName("Testing front and trailing whitespace removal: string with multiple front and trailing whitespaces")
    void removeMultipleFrontAndTrailingWhitespaces() {
        // Arrange
        String str = "   book   ";

        // Act
        String temp = LeadingAndTrailingWhitespaceRemoval.removeFrontWhitespaces(str);
        String nwcStr = LeadingAndTrailingWhitespaceRemoval.removeTrailingWhitespaces(temp);

        // Assert
        assertAll(
                "Failure in testing front and trailing whitespace removal with multiple front and trailing whitespaces",
                () -> assertNotNull(nwcStr),
                () -> assertFalse(nwcStr.isEmpty()),
                () -> assertEquals("book", nwcStr)
        );
    }

    @Test
    @DisplayName("Testing front and trailing whitespace removal: string with one in-between whitespace")
    void removeInBetweenWhitespace() {
        // Arrange
        String str = " Hello World ";

        // Act
        String temp = LeadingAndTrailingWhitespaceRemoval.removeFrontWhitespaces(str);
        String nwcStr = LeadingAndTrailingWhitespaceRemoval.removeTrailingWhitespaces(temp);

        // Assert
        assertAll(
                "Failure in testing front and trailing whitespace removal with in-between whitespace",
                () -> assertNotNull(nwcStr),
                () -> assertFalse(nwcStr.isEmpty()),
                () -> assertEquals("Hello World", nwcStr)
        );
    }

    @Test
    @DisplayName("Testing whitespace removal: string with only whitespaces")
    void removeWhitespacesFromStringWithOnlyWhitespaces() {
        // Arrange
        String str = "    ";

        // Act
        String frontRemoval = LeadingAndTrailingWhitespaceRemoval.removeFrontWhitespaces(str);
        String trailingRemoval = LeadingAndTrailingWhitespaceRemoval.removeTrailingWhitespaces(str);

        // Assert
        assertAll(
                "Failure in testing whitespace removal with only whitespaces",
                () -> assertNotNull(frontRemoval),
                () -> assertNotNull(trailingRemoval),
                () -> assertTrue(frontRemoval.isEmpty()),
                () -> assertTrue(trailingRemoval.isEmpty()),
                () -> assertEquals(frontRemoval, trailingRemoval)
        );
    }

    @Test
    @DisplayName("Testing whitespace removal: empty string")
    void removeWhitespacesFromEmptyString() {
        // Arrange
        String str = "";

        // Act
        String frontRemoval = LeadingAndTrailingWhitespaceRemoval.removeFrontWhitespaces(str);
        String trailingRemoval = LeadingAndTrailingWhitespaceRemoval.removeTrailingWhitespaces(str);

        // Assert
        assertAll(
                "Failure in testing whitespace removal from empty string",
                () -> assertNotNull(frontRemoval),
                () -> assertNotNull(trailingRemoval),
                () -> assertTrue(frontRemoval.isEmpty()),
                () -> assertTrue(trailingRemoval.isEmpty()),
                () -> assertEquals(frontRemoval, trailingRemoval)
        );
    }

    @Test
    @DisplayName("Testing whitespace removal: null")
    void removeWhitespacesFromNullValue() {
        // Assert

        assertAll(
                "Failure in testing whitespace removal from null value",
                () -> assertThrows(NullPointerException.class, () -> {
                    String frontRemoval = LeadingAndTrailingWhitespaceRemoval.removeFrontWhitespaces(null);
                }),
                () -> assertThrows(NullPointerException.class, () -> {
                    String trailingRemoval = LeadingAndTrailingWhitespaceRemoval.removeTrailingWhitespaces(null);
                })
        );
    }
}