// Last updated: 3/26/2026, 10:14:21 PM
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        int m = grid.length, n = grid[0].length;
4
5        long total = 0;
6
7        int[] bottom = new int[100001];
8        int[] top = new int[100001];
9        int[] left = new int[100001];
10        int[] right = new int[100001];
11
12        // Initialize
13        for (int[] row : grid) {
14            for (int x : row) {
15                total += x;
16                bottom[x]++;
17                right[x]++;
18            }
19        }
20
21        long sumTop = 0;
22
23        // Horizontal cuts
24        for (int i = 0; i < m - 1; i++) {
25            for (int j = 0; j < n; j++) {
26                int val = grid[i][j];
27                sumTop += val;
28
29                top[val]++;
30                bottom[val]--;
31            }
32
33            long sumBottom = total - sumTop;
34
35            if (sumTop == sumBottom) return true;
36
37            long diff = Math.abs(sumTop - sumBottom);
38
39            if (diff <= 100000) {
40                if (sumTop > sumBottom) {
41                    if (check(top, grid, 0, i, 0, n - 1, diff)) return true;
42                } else {
43                    if (check(bottom, grid, i + 1, m - 1, 0, n - 1, diff)) return true;
44                }
45            }
46        }
47
48        long sumLeft = 0;
49
50        // Vertical cuts
51        for (int j = 0; j < n - 1; j++) {
52            for (int i = 0; i < m; i++) {
53                int val = grid[i][j];
54                sumLeft += val;
55
56                left[val]++;
57                right[val]--;
58            }
59
60            long sumRight = total - sumLeft;
61
62            if (sumLeft == sumRight) return true;
63
64            long diff = Math.abs(sumLeft - sumRight);
65
66            if (diff <= 100000) {
67                if (sumLeft > sumRight) {
68                    if (check(left, grid, 0, m - 1, 0, j, diff)) return true;
69                } else {
70                    if (check(right, grid, 0, m - 1, j + 1, n - 1, diff)) return true;
71                }
72            }
73        }
74
75        return false;
76    }
77
78    private boolean check(int[] freq, int[][] grid,
79                          int r1, int r2, int c1, int c2, long diff) {
80
81        int rows = r2 - r1 + 1;
82        int cols = c2 - c1 + 1;
83
84        // single cell
85        if (rows * cols == 1) return false;
86
87        // 1D row
88        if (rows == 1) {
89            return grid[r1][c1] == diff || grid[r1][c2] == diff;
90        }
91
92        // 1D column
93        if (cols == 1) {
94            return grid[r1][c1] == diff || grid[r2][c1] == diff;
95        }
96
97        return freq[(int)diff] > 0;
98    }
99}