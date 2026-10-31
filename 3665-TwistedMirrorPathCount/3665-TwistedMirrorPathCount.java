// Last updated: 10/31/2026, 10:00:39 PM
1class Solution {
2    static final int[][][] mat = {{{1, 1}, {1, 1}}, {{0, 1}, {1, 0}}};
3    static final int MOD = 1000000007;
4
5    public int uniquePaths(int[][] A) {
6        int n = A[0].length, left = 0;
7        int[] dp = new int[n];
8
9        dp[0] = 1;
10
11        for (int[] row : A) {
12            left = 0;
13            for (int j = 0; j < n; j++) {
14                int top = dp[j], c = row[j];
15
16                dp[j] = (left * mat[c][1][0] + top * mat[c][1][1]) % MOD;
17                left  = (left * mat[c][0][0] + top * mat[c][0][1]) % MOD;
18            }
19        }
20
21        return left;
22    }
23}