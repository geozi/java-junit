package my.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Return-value tests.
 * The findMax(arr: int[]) and findMin(arr: int[])
 * methods return an integer or throw: ArrayIndexOutOfBoundsException
 * and NullPointerException. The tests are developed per input.
 */
class UnsortedArrayMinMaxElementTest {

    // Positive arrays as inputs

    @Test
    @DisplayName("Testing findMax(arr: int[]): unique and positive int array")
    void findMaxInUniquePosIntArray() {
        // Arrange
        int[] numbers = new int[]{92, 13, 21, 32, 30, 20, 15, 52, 26, 50};

        // Act
        int max = UnsortedArrayMinMaxElement.findMax(numbers);

        // Assert
        assertAll(
                "Failure in testing findMax(arr: int[]) with a unique and positive int array",
                () -> assertNotNull(numbers),
                () -> assertEquals(92, max)
        );
    }

    @Test
    @DisplayName("Testing findMin(arr: int[]): unique and positive int array")
    void findMinInUniquePosIntArray() {
        // Arrange
        int[] numbers = new int[] {48, 36, 94, 28, 96, 55, 66, 37, 52, 5};

        // Act
        int min = UnsortedArrayMinMaxElement.findMin(numbers);

        // Assert
        assertAll(
                "Failure in testing findMin(arr: int[]) with a unique and positive int array",
                () -> assertNotNull(numbers),
                () -> assertEquals(5, min)
        );
    }

    @Test
    @DisplayName("Testing findMax(arr: int[]): duplicate and positive int array")
    void findMaxInDuplicatePosIntArray() {
        // Arrange
        int[] numbers = new int[] {53, 53, 27, 56, 27, 9, 60, 82, 89, 60};

        // Act
        int max = UnsortedArrayMinMaxElement.findMax(numbers);

        // Assert
        assertAll(
                "Failure in testing findMax(arr: int[]) with a duplicate and positive int array",
                () -> assertNotNull(numbers),
                () -> assertEquals(89, max)
        );
    }

    @Test
    @DisplayName("Testing findMin(arr: int[]): duplicate and positive int array")
    void findMinInDuplicatePosIntArray() {
        // Arrange
        int[] numbers = new int[]{49, 90, 1, 30, 74, 90, 6, 32, 34, 14};

        // Act
        int min = UnsortedArrayMinMaxElement.findMin(numbers);

        // Assert
        assertAll(
                "Failure in testing findMin(arr: int[]) with a duplicate and positive int array",
                () -> assertNotNull(numbers),
                () -> assertEquals(1, min)
        );

    }

    // Negative arrays as inputs

    @Test
    @DisplayName("Testing findMax(arr: int[]): unique and negative int array")
    void findMaxInUniqueNegIntArray() {
        // Arrange
        int[] numbers = new int[]{-31, -46, -5, -22, -67, -43, -94, -11, -6, -81};

        // Act
        int max = UnsortedArrayMinMaxElement.findMax(numbers);

        // Assert
        assertAll(
                "Failure in testing findMax(arr: int[]) with a unique and negative int array",
                () -> assertNotNull(numbers),
                () -> assertEquals(-5, max)
        );
    }

    @Test
    @DisplayName("Testing findMin(arr: int[]): unique and negative int array")
    void findMinInUniqueNegIntArray() {
        // Arrange
        int[] numbers = new int[]{-23, -95, -60, -70, -50, -53, -68, -22, -84, -31};

        // Act
        int min= UnsortedArrayMinMaxElement.findMin(numbers);

        // Assert
        assertAll(
                "Failure in testing findMin(arr: int[]) with a unique and negative int array",
                () -> assertNotNull(numbers),
                () -> assertEquals(-95, min)
        );
    }

    @Test
    @DisplayName("Testing findMax(arr: int[]): duplicate and negative int array")
    void findMaxInDuplicateNegIntArray() {
        // Arrange
        int[] numbers = new int[]{-62, -63, -88, -19, -33, -43, -19, -66, -4, -25};

        // Act
        int max = UnsortedArrayMinMaxElement.findMax(numbers);

        // Assert
        assertAll(
                "Failure in testing findMax(arr: int[]) with a duplicate and negative int array",
                () -> assertNotNull(numbers),
                () -> assertEquals(-4, max)
        );
    }

    @Test
    @DisplayName("Testing findMin(arr: int[]): duplicate and negative int array")
    void findMinInDuplicateNegIntArray() {
        // Arrange
        int[] numbers = new int[] {-17, -91, -91, -16, -67, -11, -69, -16, -76, -16};

        // Act
        int min = UnsortedArrayMinMaxElement.findMin(numbers);

        // Assert
        assertAll(
                "Failure in testing findMin(arr: int[]) with a duplicate and negative int array",
                () -> assertNotNull(numbers),
                () -> assertEquals(-91, min)
        );

    }

    // Mixed arrays as inputs

    @Test
    @DisplayName("Testing findMax(arr: int[]): unique and mixed int array")
    void findMaxInUniqueMixedIntArray() {
        // Arrange
        int[] numbers = new int[] {57, 69, 90, 30, -2, -73, -83, 98, -81, 25};

        // Act
        int max = UnsortedArrayMinMaxElement.findMax(numbers);

        // Assert
        assertAll(
                "Failure in testing findMax(arr: int[]) with a unique and mixed int array",
                () -> assertNotNull(numbers),
                () -> assertEquals(98, max)
        );
    }

    @Test
    @DisplayName("Testing findMin(arr: int[]): unique and mixed int array")
    void findMinInUniqueMixedIntArray() {
        // Arrange
        int[] numbers = new int[] {63, -4, 93, 4, -22, -87, 8, -74, 48, 35};

        // Act
        int min = UnsortedArrayMinMaxElement.findMin(numbers);

        // Assert
        assertAll(
                "Failure in testing findMin(arr: int[]) with a unique and mixed int array",
                () -> assertNotNull(numbers),
                () -> assertEquals(-87, min)
        );

    }

    @Test
    @DisplayName("Testing findMax(arr: int[]): duplicate and mixed int array")
    void findMaxInDuplicateMixedIntArray() {
        // Arrange
        int[] numbers = new int[]{-69, -53, 12, -69, -69, -46, 18, 53, -26, 18};

        // Act
        int max = UnsortedArrayMinMaxElement.findMax(numbers);

        // Assert
        assertAll(
                "Failure in testing findMax(arr: int[]) with a duplicate and mixed int array",
                () -> assertNotNull(numbers),
                () -> assertEquals(53, max)
        );
    }

    @Test
    @DisplayName("Testing findMin(arr: int[]): duplicate and mixed int array")
    void findMinInDuplicateMixedIntArray() {
        // Arrange
        int[] numbers = new int[]{-20, -99, -97, 86, -97, 98, 59, 11, -12, -20};

        // Act
        int min = UnsortedArrayMinMaxElement.findMin(numbers);

        // Assert
        assertAll(
                "Failure in testing findMin(arr: int[]) with a duplicate and mixed int array",
                () -> assertNotNull(numbers),
                () -> assertEquals(-99, min)
        );
    }


    // Corner cases

    @Test
    @DisplayName("Testing findMax(arr: int[]): same element int array")
    void findMaxInSameElementArray() {
        // Arrange
        int[] numbers = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        // Act
        int max = UnsortedArrayMinMaxElement.findMax(numbers);

        // Assert
        assertAll(
                "Failure in testing findMax(arr: int[]) with a same element int array",
                () -> assertNotNull(numbers),
                () -> assertEquals(1, max)
        );
    }

    @Test
    @DisplayName("Testing findMin(arr: int[]): same element int array")
    void findMinInSameElementArray() {
        // Arrange
        int[] numbers = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // Act
        int min = UnsortedArrayMinMaxElement.findMin(numbers);

        // Assert
        assertAll(
                "Failure in testing findMin(arr: int[]) with a same element int array",
                () -> assertNotNull(numbers),
                () -> assertEquals(0, min)
        );
    }

    @Test
    @DisplayName("Testing findMax(arr: int[]): empty array")
    void findMaxInEmptyArray() {
        // Array
        int[] numbers = new int[]{};

        // Act and assert
        assertAll(
                "Failure in testing findMax(arr: int[]) with an empty array",
                () -> assertNotNull(numbers),
                () -> assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                    int max = UnsortedArrayMinMaxElement.findMax(numbers);
                })
        );
    }

    @Test
    @DisplayName("Testing findMin(arr: int[]): empty array")
    void findMinInEmptyArray() {
        // Array
        int[] numbers = new int[]{};

        // Act and assert
        assertAll(
                "Failure in testing findMin(arr: int[]) with an empty array",
                () -> assertNotNull(numbers),
                () -> assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                    int min = UnsortedArrayMinMaxElement.findMin(numbers);
                })
        );
    }

    @Test
    @DisplayName("Testing findMax(arr: int[]): null array")
    void findMaxInNullArray() {
        // Arrange
        int[] numbers = null;

        // Act and assert
        assertAll(
                "Failure in testing findMax(arr: int[]) with a null array",
                () -> assertNull(numbers),
                () -> assertThrows(NullPointerException.class, () -> {
                    int max = UnsortedArrayMinMaxElement.findMax(numbers);
                })
        );
    }

    @Test
    @DisplayName("Testing findMin(arr: int[]): null array")
    void findMinInNullArray() {
        // Arrange
        int[] numbers = null;

        // Act and assert
        assertAll(
                "Failure in testing findMin(arr: int[]) with a null array",
                () -> assertNull(numbers),
                () -> assertThrows(NullPointerException.class, () -> {
                    int min = UnsortedArrayMinMaxElement.findMin(numbers);
                })
        );
    }

}