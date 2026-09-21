// Last updated: 9/21/2026, 6:09:52 PM
1class Solution {
2    public int rob(int[] nums) {
3        int n=nums.length;
4        if(n<2){
5            return nums[0];
6        }
7        int[] dp=new int[n];
8        dp[0]=nums[0];
9        dp[1]=Math.max(nums[0],nums[1]);
10        for(int i=2;i<n;i++){
11            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
12        }
13        return dp[n-1];
14    }
15}