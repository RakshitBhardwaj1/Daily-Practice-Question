// Last updated: 3/27/2026, 2:57:25 PM
1class Solution {
2    public boolean areSimilar(int[][] mat, int k) {
3        int m = mat.length;
4        int n = mat[0].length;
5
6        k %= n; //(reduce k<n)
7
8        for (int i = 0; i < m; i++) {
9            for (int j = 0; j < n; j++) {
10                if (i % 2 == 0) {
11                    // even row , left shift
12                    if (mat[i][j] != mat[i][(j + k) % n]) {
13                        return false;
14                    }
15                } else {
16                    // odd row , right shift
17                    if (mat[i][j] != mat[i][(j - k + n) % n]) {
18                        return false;
19                    }
20                }
21            }
22        }
23
24        return true;
25    }
26}