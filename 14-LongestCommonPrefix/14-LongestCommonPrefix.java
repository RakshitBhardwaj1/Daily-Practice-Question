// Last updated: 8/2/2026, 10:32:04 PM
1class Solution {
2    public String longestCommonPrefix(String[] v) {
3        StringBuilder ans = new StringBuilder();
4        Arrays.sort(v);
5        String first = v[0];
6        String last = v[v.length-1];
7        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
8            if (first.charAt(i) != last.charAt(i)) {
9                return ans.toString();
10            }
11            ans.append(first.charAt(i));
12        }
13        return ans.toString();
14    }
15}