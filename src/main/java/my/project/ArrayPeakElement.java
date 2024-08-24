package my.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an array arr of n elements that is first strictly
 * increasing and then maybe strictly decreasing, find the
 * maximum element in the array.
 * @see <a href="https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/">Find a peak element which is not smaller than its neighbours</a>
 */
public class ArrayPeakElement {

    /**
     * Finds the peak element(s) in a list
     * of integers.
     * @param numbers An integer list.
     * @return An array containing the peak(s) of the inserted list.
     */
    static int[] findPeak(List<Integer> numbers) {
        List<Integer> peaks = new ArrayList<>();
        boolean isSortedAsc;
        boolean isSortedDesc;
        boolean hasSameElements = false;

        List<Integer> sortedAsc = new ArrayList<>(numbers);
        Collections.sort(sortedAsc);
        isSortedAsc = numbers.equals(sortedAsc);

        List<Integer> sortedDesc = new ArrayList<>(numbers);
        Collections.sort(sortedDesc);
        Collections.reverse(sortedDesc);
        isSortedDesc = numbers.equals(sortedDesc);

        List<Integer> sameElement = new ArrayList<>();
        for(Integer num : numbers) {
            Collections.fill(sameElement, num);
            hasSameElements = numbers.equals(sameElement);
        }

        if(isSortedAsc) {
            peaks.add(numbers.get(numbers.size()-1));
        } else if(isSortedDesc || hasSameElements) {
            peaks.add(numbers.get(0));
        } else {
            Integer currentNumber;
            Integer prevNumber;
            Integer nextNumber;

            for (int i = 1; i <= numbers.size() - 2; i++) {
                currentNumber = numbers.get(i);
                prevNumber = numbers.get(i - 1);
                nextNumber = numbers.get(i + 1);
                if (currentNumber > prevNumber && currentNumber > nextNumber) {
                    peaks.add(currentNumber);
                }
            }
        }
        return peaks.stream().mapToInt(Integer::intValue).toArray();
    }
}
