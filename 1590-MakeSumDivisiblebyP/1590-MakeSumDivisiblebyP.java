// Last updated: 11/30/2025, 1:26:40 PM
1class Solution {
2    public int minSubarray(int[] nums, int p) {
3        long total = 0;
4        for (int num : nums) total += num;
5
6        long target = total % p;
7        if (target == 0) return 0;
8
9        Map<Integer, Integer> mMap = new HashMap<>();
10        mMap.put(0, -1);
11
12        long prefix = 0;
13        int res = nums.length;
14
15        for (int i = 0; i < nums.length; i++) {
16            prefix = (prefix + nums[i]) % p;
17            int need = (int)((prefix - target + p) % p);
18
19            if (mMap.containsKey(need)) {
20                res = Math.min(res, i - mMap.get(need));
21            }
22
23            mMap.put((int)prefix, i);
24        }
25
26        return res == nums.length ? -1 : res;
27    }
28}