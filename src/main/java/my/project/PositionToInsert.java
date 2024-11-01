package my.project;

/**
 * The {@link PositionToInsert} class contains
 * a static method for finding the index of an existing
 * value in a sorted array or, in case of a non-existing value,
 * its prospective index in the array.
 */
public class PositionToInsert {
    static int searchPositionToInsert(int[] arr, int x) {
        int n = arr.length;
        int result;
        if(x > arr[n-1]){
            result = n;
        } else if (x == arr[n-1]) {
            result = n-1;
        } else if (x <= arr[0]) {
            result = 0;
        } else {
            int i = n-1;
            while (i > 0 && x < arr[i]) {
                i--;
            }
            if(x == arr[i]) {
                result = i;
            } else {
                result = i + 1;
            }
        }

        return result;
    }
}
