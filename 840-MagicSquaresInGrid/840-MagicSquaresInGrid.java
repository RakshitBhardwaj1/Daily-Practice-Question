// Last updated: 12/30/2025, 10:21:41 PM
1class Solution {
2
3    public int numMagicSquaresInside(int[][] grid) {
4        int ans = 0;
5        int m = grid.length;
6        int n = grid[0].length;
7        for (int row = 0; row + 2 < m; row++) {
8            for (int col = 0; col + 2 < n; col++) {
9                if (isMagicSquare(grid, row, col)) {
10                    ans++;
11                }
12            }
13        }
14        return ans;
15    }
16
17    private boolean isMagicSquare(int[][] grid, int row, int col) {
18        boolean[] seen = new boolean[10];
19        for (int i = 0; i < 3; i++) {
20            for (int j = 0; j < 3; j++) {
21                int num = grid[row + i][col + j];
22                if (num < 1 || num > 9) return false;
23                if (seen[num]) return false;
24                seen[num] = true;
25            }
26        }
27
28        // check if diagonal sums are same value
29        int diagonal1 =
30            grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2];
31        int diagonal2 =
32            grid[row + 2][col] + grid[row + 1][col + 1] + grid[row][col + 2];
33
34        if (diagonal1 != diagonal2) return false;
35
36        // check if all row sums share the same value as the diagonal sums
37        int row1 = grid[row][col] + grid[row][col + 1] + grid[row][col + 2];
38        int row2 =
39            grid[row + 1][col] +
40            grid[row + 1][col + 1] +
41            grid[row + 1][col + 2];
42        int row3 =
43            grid[row + 2][col] +
44            grid[row + 2][col + 1] +
45            grid[row + 2][col + 2];
46
47        if (!(row1 == diagonal1 && row2 == diagonal1 && row3 == diagonal1)) {
48            return false;
49        }
50
51        // check if all column sums share same value as the diagonal sums
52        int col1 = grid[row][col] + grid[row + 1][col] + grid[row + 2][col];
53        int col2 =
54            grid[row][col + 1] +
55            grid[row + 1][col + 1] +
56            grid[row + 2][col + 1];
57        int col3 =
58            grid[row][col + 2] +
59            grid[row + 1][col + 2] +
60            grid[row + 2][col + 2];
61
62        if (!(col1 == diagonal1 && col2 == diagonal1 && col3 == diagonal2)) {
63            return false;
64        }
65
66        return true;
67    }
68}