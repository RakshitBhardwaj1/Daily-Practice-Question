// Last updated: 2/14/2026, 10:11:54 PM
1class Solution {
2    public double champagneTower(int poured, int query_row, int query_glass) {
3        double[][] tower = new double[102][102];
4        tower[0][0] = (double) poured;
5
6        for (int r = 0; r <= query_row; r++) {
7            for (int c = 0; c <= r; c++) {
8                if (tower[r][c] > 1.0) {
9                    double excess = (tower[r][c] - 1.0) / 2.0;
10                    tower[r][c] = 1.0;
11                    tower[r + 1][c] += excess;
12                    tower[r + 1][c + 1] += excess;
13                }
14            }
15        }
16        return tower[query_row][query_glass];
17    }
18}