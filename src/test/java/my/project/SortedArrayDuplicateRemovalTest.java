package my.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Return-value tests.
 * The removeDuplicates(arr: int[]) method always returns
 * an array of integers or throws a NullPointerException.
 * The tests are developed per input.
 */
class SortedArrayDuplicateRemovalTest {

    @Test
    @DisplayName("Testing removeDuplicates(arr: int[]): array with unique and positive integers")
    void removeDuplicatesFromArrayWithUniqueAndPositiveIntegers() {
        // Arrange
        int[] arr = {1, 2, 3, 4, 5};

        // Act
        int[] uniqueItems = SortedArrayDuplicateRemoval.removeDuplicates(arr);

        // Assert
        assertAll(
                "Failure in testing removeDuplicates(arr: int[]) on an array with unique and positive integers",
                () -> assertNotNull(arr),
                () -> assertNotNull(uniqueItems),
                () -> assertEquals(arr.length, uniqueItems.length)
        );
    }

    @Test
    @DisplayName("Testing removeDuplicates(arr: int[]): array with unique and negative integers")
    void removeDuplicatesFromArrayWithUniqueAndNegativeIntegers() {
        // Arrange
        int[] arr = {-9, -8, -7, -6, -5, -4, -3, -2, -1};

        // Act
        int[] uniqueItems = SortedArrayDuplicateRemoval.removeDuplicates(arr);

        // Assert
        assertAll(
                "Failure in testing removeDuplicates(arr: int[]) on an array with unique and negative integers",
                () -> assertNotNull(arr),
                () -> assertNotNull(uniqueItems),
                () -> assertEquals(arr.length, uniqueItems.length)
        );
    }

    @Test
    @DisplayName("Testing removeDuplicates(arr: int[]): array with duplicate and positive integers")
    void removeDuplicatesFromArrayWithDuplicateAndPositiveIntegers() {
        // Arrange
        int[] arr = {9, 12, 24, 35, 41, 41, 43, 43, 44, 47};

        // Act
        int[] uniqueItems = SortedArrayDuplicateRemoval.removeDuplicates(arr);

        // Arrange
        assertAll(
                "Failure in testing removeDuplicates(arr: int[]) on an array with duplicate and positive integers",
                () -> assertNotNull(arr),
                () -> assertNotNull(uniqueItems),
                () -> assertNotEquals(uniqueItems.length, arr.length),
                () -> assertEquals(arr.length - 2, uniqueItems.length)
        );
    }

    @Test
    @DisplayName("Testing removeDuplicates(arr: int[]): array with duplicate and negative integers")
    void removeDuplicatesFromArrayWithDuplicateAndNegativeIntegers() {
        // Arrange
        int[] arr = {-98, -77, -77, -77, -54, -53, -53, -42, -19, -15};

        // Act
        int[] uniqueItems = SortedArrayDuplicateRemoval.removeDuplicates(arr);

        // Assert
        assertAll(
                "Failure in testing removeDuplicates(arr: int[]) on an array with duplicate and negative integers",
                () -> assertNotNull(arr),
                () -> assertNotNull(uniqueItems),
                () -> assertNotEquals(uniqueItems.length, arr.length),
                () -> assertEquals(arr.length - 3, uniqueItems.length)
        );
    }

    @Test
    @DisplayName("Testing removeDuplicates(arr: int[]): empty array")
    void removeDuplicatesFromEmptyArray() {
        // Arrange
        int[] arr = {};

        // Act and Assert
        assertAll(
                "Failure in testing removeDuplicates(arr: int[]) on an empty array",
                () -> assertNotNull(arr),
                () -> assertEquals(0, arr.length),
                () -> assertThrows(IndexOutOfBoundsException.class, () -> {
                    int[] uniqueItems = SortedArrayDuplicateRemoval.removeDuplicates(arr);
                })
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
                () -> assertNull(arr),
                () -> assertThrows(NullPointerException.class, () -> {
                    int[] uniqueItems = SortedArrayDuplicateRemoval.removeDuplicates(arr);
                })
        );
    }
}