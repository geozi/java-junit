package my.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Return-value tests.
 * The findGreatestGap(num: int) returns an integer.
 * The tests are developed per input.
 */
class MaxZeroGapInBinaryTest {

    @Test
    @DisplayName("Testing findGreatestGap(num: int): positive integer with a gap")
    void checkForBinaryGapWithOneGapPositiveInteger() {
        // Arrange
        int num = 123;

        // Act
        int maxGap = MaxZeroGapInBinary.findGreatestGap(num);

        // Assert
        assertAll(
                "Failure in testing findGreatestGap(num: int) with a positive integer that has a gap",
                () -> assertEquals(1, maxGap)
        );
    }

    @Test
    @DisplayName("Testing findGreatestGap(num: int): positive integer with multiple gaps")
    void checkForBinaryGapWithMultipleGapPositiveInteger() {
        // Arrange
        int num = 605;

        // Act
        int maxGap = MaxZeroGapInBinary.findGreatestGap(num);

        // Assert
        assertAll(
                "Failure in testing findGreatestGap(num: int) with a positive integer that has multiple gaps",
                () -> assertEquals(2, maxGap)
        );
    }

    @Test
    @DisplayName("Testing findGreatestGap(num: int): positive integer without a gap")
    void checkForBinaryGapWithNoGapPositiveInteger() {
        // Arrange
        int num = 7;

        // Act
        int maxGap = MaxZeroGapInBinary.findGreatestGap(num);

        // Assert
        assertAll(
                "Failure in testing findGreatestGap(int num) with a positive integer that has no gap",
                () -> assertEquals(0, maxGap)
        );
    }

    @Test
    @DisplayName("Testing findGreatestGap(num: int): negative integer with a gap")
    void checkForBinaryGapWithOneGapNegativeInteger(){
        // Arrange
        int num = -12;

        // Act
        int maxGap = MaxZeroGapInBinary.findGreatestGap(num);

        // Assert
        assertAll(
                "Failure in testing findGreatestGap(num: int) with negative integer that has a gap",
                () -> assertEquals(1, maxGap)
        );
    }

    @Test
    @DisplayName("Testing findGreatestGap(num: int): negative integer with multiple gaps")
    void checkForBinaryGapWithMultipleGapNegativeInteger() {
        // Arrange
        int num = -32105;

        // Act
        int maxGap = MaxZeroGapInBinary.findGreatestGap(num);

        // Assert
        assertAll(
                "Failure in testing findGreatestGap(num: int) with a negative integer that has multiple gaps",
                () -> assertEquals(5, maxGap)
        );
    }

    @Test
    @DisplayName("Testing findGreatestGap(num: int): negative integer without a gap")
    void checkForBinaryGapWithNoGapNegativeInteger() {
        // Arrange
        int num = -2;

        // Act
        int maxGap = MaxZeroGapInBinary.findGreatestGap(num);

        // Assert
        assertAll(
                "Failure in testing findGreatestGap(num: int) with negative integer that has no gap",
                () -> assertEquals(0, maxGap)
        );
    }

    @Test
    @DisplayName("Testing findGreatestGap(int num): zero")
    void  checkForBinaryGapWithZero() {
        // Arrange
        int num = 0;

        // Act
        int maxGap = MaxZeroGapInBinary.findGreatestGap(num);

        // Assert
        assertAll(
                "Failure in testing findGreatestGap(int num) with zero",
                () -> assertEquals(0, maxGap)
        );
    }

}