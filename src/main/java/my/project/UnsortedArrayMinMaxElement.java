package my.project;

/**
 * The {@link UnsortedArrayMinMaxElement} class
 * contains methods the search the min and
 * max elements in an array of integers
 * @see <a href="https://www.geeksforgeeks.org/program-find-minimum-maximum-element-array/">Program to find the minimum (or maximum) element of an array</a>.
 */
public class UnsortedArrayMinMaxElement {

    /**
     * Find the min element in an
     * array of integers.
     * @param arr An array of integers
     * @return The min integer.
     */
    static int findMin(int[] arr) {
        int n = arr.length;
        int min = arr[0];

        for(int i = 1; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    /**
     * Find the max element in an
     * array of integers.
     * @param arr An array of integers.
     * @return The max integer.
     */
    static int findMax(int[] arr) {
        int n = arr.length;
        int max = arr[0];

        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
