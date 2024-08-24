package my.project;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Return-value tests.
 * The removeDuplicates(arr: int[]) method always returns
 * an array of integers or throws a NullPointerException.
 * The tests are developed per input.
 */
class UnsortedArrayDuplicateRemovalTest {

    @Test
    @DisplayName("Testing removeDuplicates(arr: int[]): array with unique and positive integers")
    void removeDuplicatesFromArrayWithUniqueAndPositiveIntegers() {
        // Arrange
        int[] arr = new int[]{49, 42, 55, 67, 76, 38, 30, 23, 24, 15};

        // Act
        int[] uniqueNumbers = UnsortedArrayDuplicateRemoval.removeDuplicates(arr);

        // Assert
        assertAll(
                "Failure in testing removeDuplicates(arr: int[]) on an array with unique and positive integers",
                () -> assertNotNull(uniqueNumbers),
                () -> assertEquals(uniqueNumbers.length, arr.length)
        );
    }

    @Test
    @DisplayName("Testing removeDuplicates(arr: int[]): array with unique and negative integers")
    void removeDuplicatesFromArrayWithUniqueAndNegativeIntegers() {
        // Arrange
        int[] arr = new int[]{-2, -100, -37, -64, -45, -24, -3, -14, -17, -29};

        // Act
        int[] uniqueNumbers = UnsortedArrayDuplicateRemoval.removeDuplicates(arr);

        // Assert
        assertAll(
                "Failure in testing removeDuplicates(arr: int[]) on an array with unique and positive integers",
                () -> assertNotNull(uniqueNumbers),
                () -> assertEquals(uniqueNumbers.length, arr.length)
        );
    }

    @Test
    @DisplayName("Testing removeDuplicates(arr: int[]): array with unique and mixed integers")
    void removeDuplicatesFromArrayWithUniqueAndMixedIntegers() {
        // Arrange
        int[] arr = new int[]{5, -25, 90, 33, 47, 26, 41, -67, 65, -90};

        // Act
        int[] uniqueNumbers = UnsortedArrayDuplicateRemoval.removeDuplicates(arr);

        // Assert
        assertAll(
                "Failure in testing removeDuplicates(arr: int[]) on an array with unique and positive integers",
                () -> assertNotNull(uniqueNumbers),
                () -> assertEquals(uniqueNumbers.length, arr.length)
        );
    }

    @Test
    @DisplayName("Testing removeDuplicates(arr: int[]): array with positive integers")
    void removeDuplicatesFromPositiveIntegerArray() {
        // Arrange
        int[] arr = new int[]{54, 26, 32, 74, 43, 74, 78, 70, 54, 26};

        // Act
        int[] uniqueNumbers = UnsortedArrayDuplicateRemoval.removeDuplicates(arr);

        // Assert
        assertAll(
                "Failure in testing removeDuplicates(arr: int[]) on an array with positive integers",
                () -> assertNotNull(uniqueNumbers),
                () -> assertEquals(7, uniqueNumbers.length),
                () -> assertArrayEquals(new int[]{54, 26, 32, 74, 43, 78, 70}, uniqueNumbers)
        );
    }

    @Test
    @DisplayName("Testing removeDuplicates(arr: int[]): array with negative integers")
    void removeDuplicatesFromNegativeIntegerArray() {
        // Arrange
        int[] arr = new int[]{-67, -10, -20, -50, -10, -38, -66, -10, -86};

        // Act
        int[] uniqueNumbers = UnsortedArrayDuplicateRemoval.removeDuplicates(arr);

        // Assert
        assertAll(
                "Failure in testing removeDuplicates(arr: int[]) on an array with negative integers",
                () -> assertNotNull(uniqueNumbers),
                () -> assertEquals(7, uniqueNumbers.length),
                () -> assertArrayEquals(new int[]{-67, -10, -20, -50, -38, -66, -86}, uniqueNumbers)
        );
    }

    @Test
    @DisplayName("Testing removeDuplicates(arr: int[]): array with mixed integers")
    void removeDuplicatesFromMixedIntegerArray() {
        // Arrange
        int[] arr = new int[]{76, -98, -19, -66, -66, -15, 10, 98, -36, -12};

        // Act
        int[] uniqueNumbers = UnsortedArrayDuplicateRemoval.removeDuplicates(arr);

        // Assert
        assertAll(
                "Failure in testing removeDuplicates(arr: int[]) on an array with mixed integers",
                () -> assertNotNull(uniqueNumbers),
                () -> assertEquals(9, uniqueNumbers.length),
                () -> assertArrayEquals(new int[]{76, -98, -19, -66, -15, 10, 98, -36, -12}, uniqueNumbers)
        );
    }

    @Test
    @DisplayName("Testing removeDuplicates(arr: int[]): array with zeros")
    void removeDuplicatesFromArrayWithZeros() {
        // Arrange
        int[] arr = new int[]{0, 0, 0, 0, 0};

        // Act
        int[] uniqueNumbers = UnsortedArrayDuplicateRemoval.removeDuplicates(arr);

        // Assert
        assertAll("Failure in testing removeDuplicates(arr: int[]) on an array with zeros",
                () -> assertNotNull(uniqueNumbers),
                () -> assertEquals(1,uniqueNumbers.length),
                () -> assertArrayEquals(new int[]{0}, uniqueNumbers)
        );
    }

    @Test
    @DisplayName("Testing removeDuplicates(arr: int[]): array with no elements")
    void removeDuplicatesFromArrayWithNoElements(){
        // Arrange
        int[] arr = new int[0];

        // Act
        int[] uniqueNumbers = UnsortedArrayDuplicateRemoval.removeDuplicates(arr);

        // Assert
        assertAll(
                "Failure in testing removeDuplicates(arr: int[]) on an empty array",
                () -> assertNotNull(uniqueNumbers),
                () -> assertEquals(0, uniqueNumbers.length),
                () -> assertArrayEquals(new int[]{}, uniqueNumbers)
        );
    }

    @Test
    @DisplayName("Testing removeDuplicates(arr: int[]): null array")
    void removeDuplicatesFromNullArray() {
        // Arrange
        int[] arr = null;

        // Act and Assert
        assertAll(
                "Failure in testing removeDuplicates(arr: int[]) on a null array",
                () -> assertThrows(NullPointerException.class, () -> {
                    int[] uniqueNumbers = UnsortedArrayDuplicateRemoval.removeDuplicates(arr);
                })
        );

    }

}