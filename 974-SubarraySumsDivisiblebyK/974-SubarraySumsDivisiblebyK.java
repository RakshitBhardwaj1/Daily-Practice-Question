// Last updated: 11/30/2025, 5:49:35 PM
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        int n = nums.length;
4        int count = 0;
5        int[] freq = new int[k];
6        freq[0] = 1;
7        int sum = 0;
8        for (int i = 0; i < n; i++) {
9            sum += nums[i];
10            int rem = sum % k;
11            if (rem < 0) rem += k;
12            count += freq[rem];
13            freq[rem]++;
14        }
15        return count;
16    }
17}
18