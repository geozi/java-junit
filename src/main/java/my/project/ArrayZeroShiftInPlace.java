package my.project;

import java.util.Arrays;

/**
 * The {@link ArrayZeroShiftInPlace} class
 * contains a static method for shifting zeros
 * towards the end of the array.
 */
public class ArrayZeroShiftInPlace {

    /**
     * Shifts zeros to the end of the array.
     * @param arr An array of integers.
     */
    static void swapZeros(int[] arr) {
        int n = arr.length-1;
        int z = n;
        int temp = 0;

        for(int i =0; i < n; i++) {
            for(int j = 0; j < z; j++) {
                if(arr[j] == 0) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            z--;
        }
    }

}
