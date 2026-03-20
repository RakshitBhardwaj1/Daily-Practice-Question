// Last updated: 3/20/2026, 9:17:47 PM
1class Solution {
2    public int[][] minAbsDiff(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int[][] res = new int[m - k + 1][n - k + 1];
6        for (int i = 0; i + k <= m; i++) {
7            for (int j = 0; j + k <= n; j++) {
8                List<Integer> kgrid = new ArrayList<>();
9                for (int x = i; x < i + k; x++) {
10                    for (int y = j; y < j + k; y++) {
11                        kgrid.add(grid[x][y]);
12                    }
13                }
14                int kmin = Integer.MAX_VALUE;
15                Collections.sort(kgrid);
16                for (int t = 1; t < kgrid.size(); t++) {
17                    if (kgrid.get(t).equals(kgrid.get(t - 1))) {
18                        continue;
19                    }
20                    kmin = Math.min(kmin, kgrid.get(t) - kgrid.get(t - 1));
21                }
22                if (kmin != Integer.MAX_VALUE) {
23                    res[i][j] = kmin;
24                }
25            }
26        }
27        return res;
28    }
29}