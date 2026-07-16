// Last updated: 7/16/2026, 10:35:11 PM
1class Solution {
2    public long gcdSum(int[] nums) {
3        int[] prefixGcd = new int[nums.length];
4        int max = -1;
5
6        for (int i = 0; i < nums.length; i++) {
7            max = Math.max(max, nums[i]);
8            prefixGcd[i] = gcd(max, nums[i]);
9        }
10
11        Arrays.sort(prefixGcd);
12
13        long sum = 0;
14        int i = 0, j = nums.length - 1;
15
16        while (i < j) {
17            sum += gcd(prefixGcd[i], prefixGcd[j]);
18            i++;
19            j--;
20        }
21
22        return sum;
23    }
24
25    private int gcd(int a, int b) {
26        while (b != 0) {
27            int temp = b;
28            b = a % b;
29            a = temp;
30        }
31        return a;
32    }
33}