// Last updated: 2/5/2026, 7:16:29 AM
1class Solution {
2    public int[] constructTransformedArray(int[] nums) {
3        int n=nums.length;
4        int[] result=new int[n];
5        for(int i=0;i<n;i++){
6            if(nums[i]==0){
7                result[i]=nums[i];
8            }
9            else{
10                int newIndex=((i+nums[i])%n+n)%n;
11                result[i]=nums[newIndex];
12            }
13        }
14        return result;
15    }
16}