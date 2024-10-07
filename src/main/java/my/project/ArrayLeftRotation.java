package my.project;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@link ArrayLeftRotation} class contains
 * a static method for rotating the elements of a list
 * of integers by s steps to the left.
 */
public class ArrayLeftRotation {

    /**
     * Rotates the elements of a list of integers.
     * @param s The number of rotating steps.
     * @param numbers A list of integers.
     * @return A new list with the rotated integers.
     */
    static List<Integer> rotateLeft(int s, List<Integer> numbers) {
        List<Integer> rotatedNumbers = new ArrayList<>();
        int n = numbers.size();

        for(int i =0; i < n; i++) {
            rotatedNumbers.add(numbers.get((i + s) % n ));
        }

        return rotatedNumbers;
    }
}
