// Last updated: 10/25/2025, 8:45:57 PM
class Solution {
    public String lexSmallest(String s) {
        String smallest = s;
        int n = s.length();        
        for (int k = 1; k <= n; k++) {
            String revFirst = new StringBuilder(s.substring(0, k)).reverse().toString() + s.substring(k);
            String revLast = s.substring(0, n - k) + new StringBuilder(s.substring(n - k)).reverse().toString();
            if (revFirst.compareTo(smallest) < 0)
                smallest = revFirst;
            if (revLast.compareTo(smallest) < 0)
                smallest = revLast;
        }
        
        return smallest;
    }
}