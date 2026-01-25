// Last updated: 1/25/2026, 10:31:17 AM
1class Solution {
2    public int minimumDifference(int[] nums, int k) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int ans = Integer.MAX_VALUE;
6
7        for(int i = 0; i + k - 1 < n; i++){
8            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
9        }
10        return ans;
11    }
12}
13