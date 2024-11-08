package my.project;

/**
 * The {@link MaxZeroGapInBinary} class contains
 * a static method for finding the greatest zero gap
 * in the binary representation of an integer.
 */
public class MaxZeroGapInBinary {

    /**
     * Counts the number of zeros between ones
     * in the binary representation of an integer and
     * returns the largest one.
     * @param num An integer
     * @return Positive integer if there is a gap, 0 otherwise.
     */
    static int findGreatestGap(int num) {
        String numberAsBinary = Integer.toBinaryString(num);
        int n = numberAsBinary.length();

        int countZeros = 0;
        int maxGap = 0;

        for(int i =0; i < n; i++) {
            if(numberAsBinary.charAt(i) == '0') {
                countZeros++;
            } else {
                if(maxGap < countZeros) {
                    maxGap = countZeros;
                }

                countZeros =0;
            }
        }

        return maxGap;
    }
}
