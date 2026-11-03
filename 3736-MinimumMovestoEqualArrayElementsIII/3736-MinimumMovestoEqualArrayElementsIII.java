// Last updated: 11/3/2026, 9:10:12 PM
1class Solution {
2    public int minMoves(int[] nums) {
3        int max = 0, sum = 0;
4
5        for (int x : nums) {
6            max = Math.max(max, x);
7            sum += x;
8        }
9
10        return nums.length * max - sum;
11    }
12}