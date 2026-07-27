// Last updated: 7/27/2026, 10:25:03 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        return (nums[n-1]-1)*(nums[n-2]-1);
6    }
7}