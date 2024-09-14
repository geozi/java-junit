package my.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * State-change tests.
 * The swapZeros(arr: int[]) method moves all zero
 * elements, if existent, to the end of the array.
 * It throws a NullPointerException.
 */
class ArrayZeroShiftInPlaceTest {

    @Test
    @DisplayName("Testing swapZeros(arr: int[]): array with positive integers and no zeros")
    void swapArrayWithPositiveIntegersAndNoZeros() {
        // Arrange
        int[] arr = {3, 9, 10, 8, 2, 4, 7};

        // Act
        ArrayZeroShiftInPlace.swapZeros(arr);

        // Assert
        assertAll(
                "Failure in testing swapZeros(arr: int[]) on an array with positive integers and no zeros",
                () -> assertNotNull(arr),
                () -> assertArrayEquals(new int[]{3, 9, 10, 8, 2, 4, 7}, arr)
        );
    }

    @Test
    @DisplayName("Testing swapZeros(arr: int[]): array with positive integers and zeros")
    void swapArrayWithPositiveIntegersAndZeros() {
        // Arrange
        int[] arr = {8, 7, 0, 0, 0, 0, 4, 10, 3, 9};

        // Act
        ArrayZeroShiftInPlace.swapZeros(arr);

        // Assert
        assertAll(
                "Failure in testing swapZeros(arr: int[]) on an array with positive integers and zeros",
                () -> assertNotNull(arr),
                () -> assertArrayEquals(new int[]{8, 7, 4, 10, 3, 9, 0, 0 ,0 ,0}, arr)
        );
    }

    @Test
    @DisplayName("Testing swapZeros(arr: int[]): array with negative integers and no zeros")
    void swapArrayWithNegativeIntegersAndNoZeros() {
        // Arrange
        int[] arr = {-8, -7, -10, -6, -5, -1, -2, -3};

        // Act
        ArrayZeroShiftInPlace.swapZeros(arr);

        // Assert
        assertAll(
                "Failure in testing swapZeros(arr: int[]) on an array with negative integers and no zeros",
                () -> assertNotNull(arr),
                () -> assertArrayEquals(new int[]{-8, -7, -10, -6, -5, -1, -2, -3}, arr)
        );
    }

    @Test
    @DisplayName("Testing swapZeros(arr: int[]): array with negative integers and zeros")
    void swapArrayWithNegativeIntegersAndZeros() {
        // Arrange
        int[] arr = {0, 0, 0, -8, -3, -2, -4, -1, -10, -9};

        // Act
        ArrayZeroShiftInPlace.swapZeros(arr);

        // Assert
        assertAll(
                "Failure in testing swapZeros(arr: int[]) on an array with negative integers and zeros",
                () -> assertNotNull(arr),
                () -> assertArrayEquals(new int[]{-8, -3, -2, -4, -1, -10, -9, 0, 0, 0}, arr)
        );
    }

    @Test
    @DisplayName("Testing swapZeros(arr: int[]): array with mixed integers and no zeros")
    void swapArrayWithMixedIntegersAndNoZeros() {
        // Arrange
        int[] arr = {-3, -5, 7, -10, -4, 9, 5, 3, -6};

        // Act
        ArrayZeroShiftInPlace.swapZeros(arr);

        // Assert
        assertAll(
                "Failure in testing swapZeros(arr: int[]) on an array with mixed integers and no zeros",
                () -> assertNotNull(arr),
                () -> assertArrayEquals(new int[]{-3, -5, 7, -10, -4, 9, 5, 3, -6}, arr)
        );
    }

    @Test
    @DisplayName("Testing swapZeros(arr: int[]): array with mixed integers and zeros")
    void swapArrayWithMixedIntegersAndZeros() {
        // Arrange
        int[] arr = {0, 1, -1, -9, 0, 10, -10, 3, 2, 9};

        // Act
        ArrayZeroShiftInPlace.swapZeros(arr);

        // Assert
        assertAll(
                "Failure in testing swapZeros(arr: int[]) on an array with mixed integers and zeros",
                () -> assertNotNull(arr),
                () -> assertArrayEquals(new int[]{1, -1, -9, 10, -10, 3, 2, 9, 0, 0}, arr)
        );
    }

    @Test
    @DisplayName("Testing swapZeros(arr: int[]): empty array")
    void swapEmptyArray() {
        // Arrange
        int[] arr = new int[]{};

        // Act
        ArrayZeroShiftInPlace.swapZeros(arr);

        // Assert
        assertAll(
                "Failure in testing swapZeros(arr: int[]) on an empty array",
                () -> assertNotNull(arr),
                () -> assertArrayEquals(new int[]{}, arr)
        );
    }

    @Test
    @DisplayName("Testing swapZeros(arr: int[]): null array")
    void swapNullArray() {
        // Arrange
        int[] arr = null;

        // Act and Assert
        assertAll(
                "Failure in testing swapZeros(arr: int[]) on a null array",
                () -> assertNull(arr),
                () -> assertThrows(NullPointerException.class, () -> {
                    ArrayZeroShiftInPlace.swapZeros(arr);
                })
        );
    }

}