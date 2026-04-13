// Last updated: 4/13/2026, 9:58:04 PM
1class Solution {
2    public int getMinDistance(int[] nums, int target, int start) {
3
4        int min = Integer.MAX_VALUE;
5
6        for (int i = 0; i < nums.length; i++) {
7            if (nums[i] == target) {
8                min = Math.min(min, Math.abs(start - i));
9            }
10        }
11
12        return min;
13    }
14}