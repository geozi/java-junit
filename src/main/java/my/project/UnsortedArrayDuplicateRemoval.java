package my.project;

import java.util.Arrays;

/**
 * The {@link UnsortedArrayDuplicateRemoval} class
 * contains a method for the removal of duplicate
 * numbers.
 */
public class UnsortedArrayDuplicateRemoval {

    /**
     * Removes duplicate numbers from a
     * numerical array.
     * @param arr An array of integers.
     * @return An array of unique integers.
     */
    static int[] removeDuplicates(int[] arr) {

        int n = arr.length;
        int[] tempArr = new int[n];
        Arrays.fill(tempArr, -1);
        int uniqueNumberIndex = 0;
        boolean isStored = false;

        for(int i =0; i < n; i++) {

            for(int j = 0; j <= uniqueNumberIndex; j++) {
                if(arr[i] == tempArr[j]) {
                    isStored = true;
                    break;
                }
            }

            if(!isStored && tempArr[uniqueNumberIndex] == -1) {
                tempArr[uniqueNumberIndex] = arr[i];
                uniqueNumberIndex++;
            }

            isStored = false;

        }

        return Arrays.copyOf(tempArr, uniqueNumberIndex);
    }

}
