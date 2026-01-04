// Last updated: 1/4/2026, 10:07:48 AM
1class Solution {
2    public int sumFourDivisors(int[] nums) {
3        long total = 0;
4        for (int n : nums) {
5            int cnt = 0;
6            int s = 0;
7            int root = (int) Math.sqrt(n);
8            for (int i = 1; i <= root; i++) {
9                if (n % i == 0) {
10                    int j = n / i;
11
12                    if (i == j) {
13                        cnt += 1;
14                        s += i;
15                    } else {
16                        cnt += 2;
17                        s += i + j;
18                    }
19                    if (cnt > 4) break;
20                }
21            }
22            if (cnt == 4) {
23                total += s;
24            }
25        }
26        return (int) total;
27    }
28}