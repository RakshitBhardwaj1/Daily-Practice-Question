// Last updated: 4/23/2026, 10:16:32 PM
1class Solution {
2    public long[] distance(int[] nums) {
3        int n = nums.length;
4        long[] ans = new long[n];
5
6        Map<Integer, List<Integer>> mp = new HashMap<>();
7
8        for (int i = 0; i < n; i++) {
9            mp.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
10        }
11
12        for (List<Integer> pos : mp.values()) {
13
14            long sum = 0;
15            for (int x : pos) sum += x;
16
17            long leftSum = 0;
18            int m = pos.size();
19
20            for (int i = 0; i < m; i++) {
21                long rightSum = sum - leftSum - pos.get(i);
22
23                long left  = (long) pos.get(i) * i - leftSum;
24                long right = rightSum - (long) pos.get(i) * (m - i - 1);
25
26                ans[pos.get(i)] = left + right;
27
28                leftSum += pos.get(i);
29            }
30        }
31
32        return ans;
33    }
34}