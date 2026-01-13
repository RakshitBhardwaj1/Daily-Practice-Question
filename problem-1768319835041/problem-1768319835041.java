// Last updated: 1/13/2026, 9:27:15 PM
1class Solution {
2    public int maximumGap(int[] nums) {
3        if (nums == null || nums.length < 2) return 0;
4
5        int n = nums.length;
6        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
7
8        for (int num : nums) {
9            min = Math.min(min, num);
10            max = Math.max(max, num);
11        }
12
13        if (min == max) return 0;
14
15        int gap = (int) Math.ceil((double)(max - min) / (n - 1));
16
17        int[] bucketMin = new int[n - 1];
18        int[] bucketMax = new int[n - 1];
19        Arrays.fill(bucketMin, Integer.MAX_VALUE);
20        Arrays.fill(bucketMax, Integer.MIN_VALUE);
21
22        for (int num : nums) {
23            if (num == min || num == max) continue;
24            int idx = (num - min) / gap;
25            bucketMin[idx] = Math.min(bucketMin[idx], num);
26            bucketMax[idx] = Math.max(bucketMax[idx], num);
27        }
28
29        int maxGap = 0;
30        int prev = min;
31
32        for (int i = 0; i < n - 1; i++) {
33            if (bucketMin[i] == Integer.MAX_VALUE) continue;
34            maxGap = Math.max(maxGap, bucketMin[i] - prev);
35            prev = bucketMax[i];
36        }
37
38        maxGap = Math.max(maxGap, max - prev);
39        return maxGap;
40    }
41}
42