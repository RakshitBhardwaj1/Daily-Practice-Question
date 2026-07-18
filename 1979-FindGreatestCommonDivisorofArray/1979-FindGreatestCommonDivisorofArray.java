// Last updated: 7/18/2026, 7:01:15 PM
1class Solution {
2    public int findGCD(int[] nums) {
3        int n=nums.length;
4        int min=Integer.MAX_VALUE;
5        int max=Integer.MIN_VALUE;
6        for(int i=0;i<n;i++){
7            min=Math.min(min,nums[i]);
8            max=Math.max(max,nums[i]);
9        }
10        while(min!=0){
11            int temp=max%min;
12            max=min;
13            min=temp;
14        }
15        return max;
16    }
17}