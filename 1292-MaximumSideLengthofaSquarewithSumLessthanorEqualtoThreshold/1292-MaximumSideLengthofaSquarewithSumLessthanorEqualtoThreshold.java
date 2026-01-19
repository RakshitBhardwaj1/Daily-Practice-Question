// Last updated: 1/19/2026, 9:52:37 PM
1class Solution {
2
3    public int maxSideLength(int[][] mat, int threshold) {
4        int m = mat.length;
5        int n = mat[0].length;
6        int[][] P = new int[m + 1][n + 1];
7        for (int i = 1; i <= m; i++) {
8            for (int j = 1; j <= n; j++) {
9                P[i][j] =
10                    P[i - 1][j] +
11                    P[i][j - 1] -
12                    P[i - 1][j - 1] +
13                    mat[i - 1][j - 1];
14            }
15        }
16
17        int l = 1;
18        int r = Math.min(m, n);
19        int ans = 0;
20        while (l <= r) {
21            int mid = (l + r) / 2;
22            boolean find = false;
23            for (int i = 1; i <= m - mid + 1; i++) {
24                for (int j = 1; j <= n - mid + 1; j++) {
25                    int sum =
26                        P[i + mid - 1][j + mid - 1] -
27                        P[i - 1][j + mid - 1] -
28                        P[i + mid - 1][j - 1] +
29                        P[i - 1][j - 1];
30                    if (sum <= threshold) {
31                        find = true;
32                        break;
33                    }
34                }
35                if (find) break;
36            }
37            if (find) {
38                ans = mid;
39                l = mid + 1;
40            } else {
41                r = mid - 1;
42            }
43        }
44        return ans;
45    }
46}