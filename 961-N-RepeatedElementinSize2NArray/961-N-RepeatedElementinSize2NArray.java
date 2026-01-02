// Last updated: 1/2/2026, 10:29:12 AM
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        int l=nums.length;
4        int n=l/2;
5        HashMap<Integer,Integer> map=new HashMap<>();
6        for(int num:nums){
7            map.put(num,map.getOrDefault(num,0)+1);
8            if(map.get(num)==n){
9                return num;
10            }
11        }
12        
13        return -1;
14    }
15}