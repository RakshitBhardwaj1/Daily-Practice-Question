// Last updated: 10/24/2025, 11:53:49 AM
class Solution {
    public int nextBeautifulNumber(int n) {
        for (int i = n + 1; i <= 1224444; i++) {
            if (isBalanced(i)) return i;
        }
        return -1;
    }

    private boolean isBalanced(int num) {
        int[] count = new int[10];
        char[] digits = String.valueOf(num).toCharArray();
        for (char c : digits) count[c - '0']++;
        for (char c : digits) {
            int d = c - '0';
            if (count[d] != d) return false;
        }
        return true;
    }
}
