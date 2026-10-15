// Last updated: 10/15/2026, 10:49:10 AM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int n=nums.length;
4        int slow=nums[0];
5        int fast=nums[0];
6        
7        slow=nums[slow];
8        fast=nums[nums[fast]];
9
10        while(slow!=fast){
11            slow=nums[slow];
12            fast=nums[nums[fast]];
13        }
14
15        slow=nums[0];
16        while(slow!=fast){
17            slow=nums[slow];
18            fast=nums[fast];
19        }
20        return slow;
21    }
22}