// Last updated: 11/27/2025, 12:05:15 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int xor=0;
4		for(int i=0;i<nums.length;i++) {
5			xor=xor^nums[i];
6		}
7		return xor;
8    }
9}