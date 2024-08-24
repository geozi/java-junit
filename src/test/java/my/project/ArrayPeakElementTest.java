package my.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Return-value tests.
 * The findPeak(numbers: List<Integer>) method returns
 * an array of integers or throws: IndexOutOfBoundsException
 * and NullPointerException. The tests are developed per input.
 */
class ArrayPeakElementTest {

    @Test
    @DisplayName("Testing the findPeak(): unsorted list")
    void findPeakWithUnsortedList() {
        // Arrange
        List<Integer> numbers = new ArrayList<>(List.of(5, 10, 20, 15));

        // Act
        int[] peaks = ArrayPeakElement.findPeak(numbers);

        // Assert
        assertAll(
                "Failure in testing the findPeak() with unsorted list",
                () -> assertNotNull(numbers),
                () -> assertNotNull(peaks),
                () -> assertEquals(1, peaks.length),
                () -> assertArrayEquals(new int[]{20}, peaks)
        );
    }

    @Test
    @DisplayName("Testing the findPeak(): unsorted list with multiple peaks")
    void findPeakWithUnsortedMultiplePeakList() {
        // Arrange
        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 15, 2, 23, 90, 67));

        // Act
        int[] peaks = ArrayPeakElement.findPeak(numbers);

        // Assert
        assertAll(
                "Failure in testing the findPeak() with multiple peaks",
                () -> assertNotNull(numbers),
                () -> assertNotNull(peaks),
                () -> assertEquals(2, peaks.length),
                () -> assertArrayEquals(new int[]{20, 90}, peaks)
        );
    }

    @Test
    @DisplayName("Testing the findPeak(): sorted (asc) list")
    void findPeakWithSortedAscList() {
        // Arrange
        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        // Act
        int[] peaks = ArrayPeakElement.findPeak(numbers);

        // Assert
        assertAll(
                "Failure in testing the findPeak() with sorted (asc) list",
                () -> assertNotNull(numbers),
                () -> assertNotNull(peaks),
                () -> assertEquals(1, peaks.length),
                () -> assertArrayEquals(new int[]{50}, peaks)
        );
    }

    @Test
    @DisplayName("Testing the findPeak(): sorted (desc) list ")
    void findPeakWithSortedDescList() {
        // Arrange
        List<Integer> numbers = new ArrayList<>(List.of(100, 80, 60, 50, 20));

        // Act
        int[] peaks = ArrayPeakElement.findPeak(numbers);

        // Assert
        assertAll(
                "Failure in testing the findPeak() with sorted (desc) list",
                () -> assertNotNull(numbers),
                () -> assertNotNull(peaks),
                () -> assertEquals(1, peaks.length),
                () -> assertArrayEquals(new int[]{100}, peaks)
        );
    }

    @Test
    @DisplayName("Testing the findPeak(): same element list")
    void findPeakWithSameElementList() {
        // Arrange
        List<Integer> numbers = new ArrayList<>(List.of(1,1,1,1,1,1,1));

        // Act
        int[] peaks = ArrayPeakElement.findPeak(numbers);

        // Assert
        assertAll(
                "Failure in testing the findPeak() with same element list",
                () -> assertNotNull(numbers),
                () -> assertNotNull(peaks),
                () -> assertEquals(1, peaks.length),
                () -> assertArrayEquals(new int[]{1}, peaks)
        );
    }

    @Test
    @DisplayName("Testing the findPeak(): empty list")
    void findPeakWithEmptyList() {
        // Arrange
        List<Integer> numbers = new ArrayList<>();

        // Act and assert
        assertAll(
                "Failure in testing the findPeak() with empty list",
                () -> assertNotNull(numbers),
                () -> assertThrows(IndexOutOfBoundsException.class, () -> {
                    int[] peaks = ArrayPeakElement.findPeak(numbers);
                })
        );
    }

    @Test
    @DisplayName("Testing the findPeak(): null value")
    void findPeakWithNullValue() {
        // Arrange
        List<Integer> numbers = null;

        // Act and assert
        assertAll(
                "Failure in testing the findPeak() with null value",
                () -> assertNull(numbers),
                () -> assertThrows(NullPointerException.class, () -> {
                    int[] peaks = ArrayPeakElement.findPeak(numbers);
                })
        );
    }
}