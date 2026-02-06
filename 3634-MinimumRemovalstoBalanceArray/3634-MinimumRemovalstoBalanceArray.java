// Last updated: 2/6/2026, 10:49:34 PM
1class Solution {
2    public int minRemoval(int[] nums, int k) {
3        Arrays.sort(nums);
4        int i = 0;
5        int maxLen = 0;
6
7        for (int j = 0; j < nums.length; j++) {
8            // Use long to prevent integer overflow for nums[i] * k
9            while ((long) nums[j] > (long) nums[i] * k) {
10                i++;
11            }
12            maxLen = Math.max(maxLen, j - i + 1);
13        }
14
15        return nums.length - maxLen;
16    }
17}