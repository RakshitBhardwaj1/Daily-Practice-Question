// Last updated: 7/26/2026, 10:28:25 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int pro=1;
6        pro=nums[n-1]*nums[n-2]*nums[n-3];
7        int product2 = nums[0] * nums[1] * nums[n - 1];
8        return Math.max(pro,product2);
9    }
10}