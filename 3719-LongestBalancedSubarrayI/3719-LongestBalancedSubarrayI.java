// Last updated: 2/10/2026, 11:04:34 PM
1class Solution {
2    public int longestBalanced(int[] nums) {
3        int n = nums.length;
4        int ans = 0;
5        for (int i = 0; i < n; i++) {
6            HashSet<Integer> evenSet = new HashSet<>();
7            HashSet<Integer> oddSet = new HashSet<>();
8
9            for (int j = i; j < n; j++) {
10
11                if (nums[j] % 2 == 0) {
12                    evenSet.add(nums[j]);
13                }
14                else {
15                    oddSet.add(nums[j]);
16                }
17                if (evenSet.size() == oddSet.size()) {
18                    ans = Math.max(ans, j - i + 1);
19                }
20            }
21        }
22
23        return ans;
24    }
25}
26