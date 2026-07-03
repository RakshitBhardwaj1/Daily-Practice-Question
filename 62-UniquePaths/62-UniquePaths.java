// Last updated: 7/3/2026, 10:43:47 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[] aboveRow = new int[n];
4        Arrays.fill(aboveRow, 1);
5
6        for (int row = 1; row < m; row++) {
7            int[] currentRow = new int[n];
8            Arrays.fill(currentRow, 1);
9            for (int col = 1; col < n; col++) {
10                currentRow[col] = currentRow[col - 1] + aboveRow[col];
11            }
12            aboveRow = currentRow;
13        }
14
15        return aboveRow[n - 1];        
16    }
17}