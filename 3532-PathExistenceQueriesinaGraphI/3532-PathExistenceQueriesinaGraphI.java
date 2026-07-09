// Last updated: 7/9/2026, 10:19:29 AM
1class Solution {
2    public int countMajoritySubarrays(int[] nums, int target) {
3        int n=nums.length;
4        int count=0;
5        
6        for(int i=0;i<n;i++){
7            int t_c=0;
8            for(int j=i;j<n;j++){
9                if(nums[j]==target){
10                    t_c++;
11                }
12                int len=j-i+1;
13                if(t_c>len/2){
14                    count++;
15                }
16            }
17            
18        }
19        return count;
20    }
21}