// Last updated: 10/12/2025, 4:22:56 PM
class Solution {
    public int smallestNumber(int n) {
        // x is a power of two, x - 1 is of form 111...1 in binary
        int x = 1;
        while (x - 1 < n) {
            x <<= 1;
        }
        return x - 1;
    }
}
