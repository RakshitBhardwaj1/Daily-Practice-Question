// Last updated: 7/19/2026, 10:12:20 PM
1class Solution {
2    public String smallestSubsequence(String text) {
3        StringBuilder sb = new StringBuilder();
4        int[] count = new int[128];
5        boolean[] used = new boolean[128];
6        for (char c : text.toCharArray()) {
7            count[c]++;
8        }
9        for (char c : text.toCharArray()) {
10            count[c]--;
11            if (used[c]) {
12                continue;
13            }
14            while (sb.length() > 0 &&
15                   last(sb) > c &&
16                   count[last(sb)] > 0) {
17
18                used[last(sb)] = false;
19                sb.setLength(sb.length() - 1);
20            }
21            sb.append(c);
22            used[c] = true;
23        }
24        return sb.toString();
25    }
26    private char last(StringBuilder sb) {
27        return sb.charAt(sb.length() - 1);
28    }
29}