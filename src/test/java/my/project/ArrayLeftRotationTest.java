package my.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Return-value tests.
 * The rotateLeft(s: int, numbers: List<Integer>) method returns
 * a List<Integer> object or a null object. It throws a
 * NullPointerException.
 */
class ArrayLeftRotationTest {

    @Test
    @DisplayName("Testing rotateLeft(s: int, numbers: List<Integer>): integer list")
    void rotateIntegerList() {
        // Arrange
        List<Integer> numbers = new ArrayList<>(List.of( 1, 2, 3, 4, 5));

        // Act
        List<Integer> rotatedList = ArrayLeftRotation.rotateLeft(1, numbers);

        // Assert
        assertAll(
                "Failure in testing left rotation with integer list",
                () -> assertNotNull(numbers),
                () -> assertNotNull(rotatedList),
                () -> assertEquals(numbers.size(), rotatedList.size()),
                () -> assertEquals(new ArrayList<>(List.of( 2, 3, 4, 5, 1)), rotatedList )
        );
    }

    @Test
    @DisplayName("Testing rotateLeft(s: int, numbers: List<Integer>): empty list")
    void rotateEmptyList() {
        // Arrange
        List<Integer> numbers = new ArrayList<>(List.of( ));

        // Act
        List<Integer> rotatedList = ArrayLeftRotation.rotateLeft(1, numbers);

        // Assert
        assertAll(
                "Failure in testing left rotation with empty list",
                () -> assertNotNull(numbers),
                () -> assertNotNull(rotatedList),
                () -> assertEquals(0, numbers.size()),
                () -> assertEquals(0, rotatedList.size())
        );
    }

    @Test
    @DisplayName("Testing rotateLeft(s: int, numbers: List<Integer>): null values")
    void rotateNullList() {
        // Arrange
        List<Integer> numbers = null;

        // Act and Assert
        assertAll(
                "Failure in testing left rotation with null values",
                () -> assertNull(numbers),
                () -> assertThrows(NullPointerException.class, () -> {
                    List<Integer> rotatedList = ArrayLeftRotation.rotateLeft(1, numbers);
                })
        );
    }
}