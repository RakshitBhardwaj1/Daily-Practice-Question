// Last updated: 10/18/2025, 9:18:13 PM
import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128]; // ASCII range

        // Count character frequencies
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        // Calculate usable pairs and check odd counts
        for (int count : freq) {
            length += (count / 2) * 2; // add all even parts
            if (count % 2 == 1) {
                hasOdd = true;
            }
        }

        // Add one center character if possible
        if (hasOdd) {
            length += 1;
        }

        return length;
    }
}
