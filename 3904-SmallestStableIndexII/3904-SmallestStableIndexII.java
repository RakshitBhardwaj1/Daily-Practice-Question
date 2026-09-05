// Last updated: 9/5/2026, 10:48:58 PM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int maxSoFar = -1;
4        int cand = 0, max = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7            maxSoFar = Math.max(maxSoFar, nums[i]);
8
9            if (i == cand) max = maxSoFar;
10
11            if (nums[i] < max - k)
12                cand = i + 1;
13        }
14
15        return cand < nums.length ? cand : -1;
16    }
17}