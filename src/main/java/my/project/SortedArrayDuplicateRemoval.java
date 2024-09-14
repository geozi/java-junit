package my.project;

import java.util.Arrays;

/**
 * The {@link SortedArrayDuplicateRemoval} class
 *  contains a static method for the removal of
 *  duplicate integers from a sorted array.
 */
public class SortedArrayDuplicateRemoval {

    /**
     * Removes duplicate integers from an
     * array of integers.
     * @param arr An array of integers.
     * @return An array of unique integers.
     */
    static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j =0;
        temp[0] = arr[0];

        for(int i =1; i < n; i++) {
            if(arr[i] != arr[i-1]) {
                temp[++j] = arr[i];
            }
        }

        return Arrays.copyOfRange(temp, 0, j+1);
    }

}
