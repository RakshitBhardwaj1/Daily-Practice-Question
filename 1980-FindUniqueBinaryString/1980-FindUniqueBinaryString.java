// Last updated: 3/8/2026, 10:26:21 PM
1class Solution {
2    public String findDifferentBinaryString(String[] nums) {
3
4        int n = nums.length;
5        int size = (int)Math.pow(2, n);
6
7        int[] nu = new int[size];
8
9        for(String num : nums){
10            int val = Integer.parseInt(num, 2);
11            nu[val]++;
12        }
13
14        for(int i = 0; i < size; i++){
15            if(nu[i] == 0){
16                String ans = Integer.toBinaryString(i);
17                return "0".repeat(n - ans.length()) + ans;
18            }
19        }
20
21        return "0".repeat(n);
22    }
23}