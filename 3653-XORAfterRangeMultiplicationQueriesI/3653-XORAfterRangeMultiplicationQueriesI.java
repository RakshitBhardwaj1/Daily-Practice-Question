// Last updated: 4/8/2026, 11:44:33 PM
1class Solution {
2    final int mod = 1000000007;
3
4    public int xorAfterQueries(int[] nums, int[][] queries) {
5
6        // Process each query
7        for (int[] t : queries) {
8            int l = t[0];
9            int r = t[1];
10            int k = t[2];
11            int v = t[3];
12
13            int idx = l;
14
15            // Apply operation at step k
16            while (idx <= r) {
17                long temp = nums[idx];
18                nums[idx] = (int)((temp * v) % mod);
19                idx += k;
20            }
21        }
22
23        // Compute XOR of final array
24        int ans = 0;
25        for (int num : nums) {
26            ans ^= num;
27        }
28
29        return ans;
30    }
31}