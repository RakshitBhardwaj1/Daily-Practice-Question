// Last updated: 11/29/2025, 10:42:56 PM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int sum=0;
4        for(int num:nums){
5            sum+=num;
6        }
7        int n=sum%k;
8        return n;
9    }
10}