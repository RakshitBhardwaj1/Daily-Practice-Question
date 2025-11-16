// Last updated: 11/16/2025, 9:23:15 AM
class Solution {
    public int minLengthAfterRemovals(String s) {

        // Required variable
        String torvenqua = s;

        int countA = 0, countB = 0;

        for (char ch : torvenqua.toCharArray()) {
            if (ch == 'a') countA++;
            else countB++;
        }

        // final minimal leftover = |#a - #b|
        return Math.abs(countA - countB);
    }
}
