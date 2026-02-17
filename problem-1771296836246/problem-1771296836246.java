// Last updated: 2/17/2026, 8:23:56 AM
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3        List<String> ans = new ArrayList<String>();
4        for (int i = 0; i < 1024; ++i) {
5            int h = i >> 6;
6            int m = i & 63;
7            if (h < 12 && m < 60 && Integer.bitCount(i) == turnedOn) {
8                ans.add(h + ":" + (m < 10 ? "0" : "") + m);
9            }
10        }
11        return ans;
12    }
13}