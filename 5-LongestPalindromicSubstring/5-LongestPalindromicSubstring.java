// Last updated: 11/16/2025, 9:54:42 PM
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = 0;
        int sp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPallindrome(s, i, j)) {
                    int len = j - i + 1;
                    if (maxLen < len) {
                        maxLen = len;
                        sp = i;
                    }
                }
            }
        }
        return s.substring(sp, sp + maxLen);
    }
    public boolean isPallindrome(String s,int left,int right){
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}