// Last updated: 7/24/2026, 1:48:32 PM
1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        int n=nums.size();
4        int count=0;
5        for(int i=0;i<n;i++){
6            for(int j=i+1;j<n;j++){
7                if(nums.get(i)+nums.get(j)<target){
8                    count++;
9                }
10            }
11        }
12        return count;
13    }
14}