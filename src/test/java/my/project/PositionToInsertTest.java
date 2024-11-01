package my.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Return-value tests.
 * The searchPositionToInsert(arr: int[], x: int) method returns
 * an integer. It throws either an IndexOutOfBoundsException or a NullPointerException.
 * The tests are developed per input.
 */
class PositionToInsertTest {

    @Test
    @DisplayName("Testing searchPositionToInsert(arr: int[], x: int): array with unique positive integers")
    void searchPositionInUniquePositiveArray() {
        // Arrange
        int[] arr = new int[]{0, 3, 4, 5, 7};
        int x = 2;

        // Act
        int position = PositionToInsert.searchPositionToInsert(arr, x);

        // Assert
        assertAll("Failure in testing searchPositionToInsert(arr: int[], x: int) with an array of unique positive integers",
                () -> assertEquals(1,position)
        );

    }

    @Test
    @DisplayName("Testing searchPositionToInsert(arr: int[], x: int): array with unique negative integers")
    void searchPositionInUniqueNegativeArray(){
        // Arrange
        int[] arr = new int[]{-8, -6, -3, -1};
        int x = -4;

        // Act
        int position = PositionToInsert.searchPositionToInsert(arr, x);

        // Assert
        assertAll(
                "Failure in testing searchPositionToInsert(arr: int[], x: int) with an array of unique negative integers",
                () ->  assertEquals(2, position)
        );
    }

    @Test
    @DisplayName("Testing searchPositionToInsert(arr: int[], x: int): array with unique mixed integers")
    void searchPositionInUniqueMixedArray(){
        // Arrange
        int[] arr= new int[]{-12, -2, 0, 3, 7, 10};
        int x = -3;

        // Act
        int position = PositionToInsert.searchPositionToInsert(arr, x);

        // Assert
        assertAll(
                "Failure in testing searchPositionToInsert(arr: int[], x: int) with an array of unique mixed integers",
                () -> assertEquals(1, position)
        );

    }

    @Test
    @DisplayName("Testing searchPositionToInsert(arr: int[], x: int): array with duplicate positive integers")
    void searchPositionInDuplicatePositiveArray(){
        // Arrange
        int[] arr = new int[]{0, 2, 2, 4, 6, 9, 12};
        int x = 3;

        // Act
        int position = PositionToInsert.searchPositionToInsert(arr, x);

        // Assert
        assertAll(
                "Failure in testing searchPositionToInsert(arr: int[], x: int) with an array of duplicate positive integers",
                () -> assertEquals(3, position)
        );

    }

    @Test
    @DisplayName("Testing searchPositionToInsert(arr: int[], x: int): array with duplicate negative integers")
    void searchPositionInDuplicateNegativeArray() {
        // Arrange
        int[] arr = new int[]{-12, -6, -6, -6, -3, -1};
        int x = -8;

        // Act
        int position = PositionToInsert.searchPositionToInsert(arr, x);

        // Assert
        assertAll(
                "Failure in testing searchPositionToInsert(arr: int[], x: int) with an array of duplicate negative integers",
                () -> assertEquals(1, position)
        );
    }

    @Test
    @DisplayName("Testing searchPositionToInsert(arr: int[], x: int): array with duplicate mixed integers")
    void searchPositionInDuplicateMixedArray(){
        // Arrange
        int[] arr = new int[]{-15, -5, -5, 1, 1, 4, 22};
        int x = 0;

        // Act
        int position = PositionToInsert.searchPositionToInsert(arr, x);

        // Assert
        assertAll(
                "Failure in testing searchPositionToInsert(arr: int[], x: int) with an array of duplicate mixed integers",
                () -> assertEquals(3, position)
        );
    }

    @Test
    @DisplayName("Testing searchPositionToInsert(arr: int[], x: int): empty array")
    void searchPositionInEmptyArray() {
        // Arrange
        int[] arr = new int[]{};
        int x = 2;

        // Act and Assert
        assertAll(
                "Failure in testing searchPositionToInsert(arr: int[], x: int) with an empty array",
                () -> assertThrows(IndexOutOfBoundsException.class, () -> {
                    int position = PositionToInsert.searchPositionToInsert(arr, x);
                })
        );

    }

    @Test
    @DisplayName("Testing searchPositionToInsert(arr: int[], x: int): null array")
    void searchPositionNullArray(){
        // Arrange
        int x = 12;

        // Act and Assert
        assertAll(
                "Failure in testing searchPositionToInsert(arr: int[], x: int) with a null array",
                () -> assertThrows(NullPointerException.class, () -> {
                    int position = PositionToInsert.searchPositionToInsert(null, x);
                })
        );
    }

}