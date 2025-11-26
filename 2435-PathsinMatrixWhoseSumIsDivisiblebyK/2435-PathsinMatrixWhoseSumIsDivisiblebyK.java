// Last updated: 11/26/2025, 11:28:00 PM
1class Solution {
2
3    private static final int MOD = 1000000007;
4
5    public int numberOfPaths(int[][] grid, int k) {
6        int m = grid.length;
7        int n = grid[0].length;
8
9        long[][][] dp = new long[m + 1][n + 1][k];
10
11        for (int i = 1; i <= m; i++) {
12            for (int j = 1; j <= n; j++) {
13                if (i == 1 && j == 1) {
14                    dp[i][j][grid[0][0] % k] = 1;
15                    continue;
16                }
17
18                int value = grid[i - 1][j - 1] % k;
19                for (int r = 0; r < k; r++) {
20                    int prevMod = (r - value + k) % k;
21                    dp[i][j][r] =
22                        (dp[i - 1][j][prevMod] + dp[i][j - 1][prevMod]) % MOD;
23                }
24            }
25        }
26
27        return (int) dp[m][n][0];
28    }
29}