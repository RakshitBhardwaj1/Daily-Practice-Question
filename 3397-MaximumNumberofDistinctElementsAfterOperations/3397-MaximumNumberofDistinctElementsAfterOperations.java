// Last updated: 10/18/2025, 9:11:33 PM
import java.util.*;

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array
        int count = 0;
        long prev = Long.MIN_VALUE; // to handle large negative values

        for (int x : nums) {
            long low = (long) x - k;
            long high = (long) x + k;

            // Find the smallest possible distinct value > prev
            long candidate = Math.max(prev + 1, low);

            // If within range, assign and count it
            if (candidate <= high) {
                count++;
                prev = candidate;
            }
            // else skip this number (can't make it distinct)
        }
        return count;
    }
}
