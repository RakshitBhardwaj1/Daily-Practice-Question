// Last updated: 9/26/2026, 12:57:27 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int n=nums.length;
4        int d=n-1;
5        for(int i=n-2;i>=0;i--){
6            if(i+nums[i]>=d){
7                d=i;
8            }
9        }
10        return d==0;
11    }
12}