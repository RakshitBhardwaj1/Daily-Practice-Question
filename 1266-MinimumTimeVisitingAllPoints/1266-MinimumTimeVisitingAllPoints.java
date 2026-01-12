// Last updated: 1/12/2026, 10:40:44 PM
1class Solution {
2    public int minTimeToVisitAllPoints(int[][] p) {
3        int ans = 0;
4        for (int i = 1; i < p.length; i++) {
5            ans += Math.max(
6                Math.abs(p[i][0] - p[i - 1][0]),
7                Math.abs(p[i][1] - p[i - 1][1])
8            );
9        }
10        return ans;
11    }
12}