// Last updated: 1/24/2026, 8:28:11 AM
1class Solution {
2    public int minPairSum(int[] nums) {
3        int n=nums.length;
4        Arrays.sort(nums);
5        int i=0;
6        int j=n-1;
7        int ans=0;
8        while(i<j){
9            ans=Math.max(ans,nums[i]+nums[j]);
10            i++;
11            j--;
12        }
13        return ans;
14    }
15}