// Last updated: 1/11/2026, 10:29:57 PM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
4            return 0;
5
6        int M = matrix.length;
7        int N = matrix[0].length;
8
9        int[][] mat = new int[M][N];
10
11        for (int i = 0; i < M; i++) {
12            for (int j = 0; j < N; j++) {
13                mat[i][j] = matrix[i][j] - '0';
14            }
15        }
16        for (int i = 0; i < M; i++) {
17            for (int j = 1; j < N; j++) {
18                if (mat[i][j] == 1) {
19                    mat[i][j] += mat[i][j - 1];
20                }
21            }
22        }
23        int Ans = 0;
24        for (int j = 0; j < N; j++) {
25            for (int i = 0; i < M; i++) {
26                int width = mat[i][j];
27                if (width == 0) continue;
28                int currWidth = width;
29                for (int k = i; k < M && mat[k][j] > 0; k++) {
30                    currWidth = Math.min(currWidth, mat[k][j]);
31                    int height = k - i + 1;
32                    Ans = Math.max(Ans, currWidth * height);
33                }
34                currWidth = width;
35                for (int k = i; k >= 0 && mat[k][j] > 0; k--) {
36                    currWidth = Math.min(currWidth, mat[k][j]);
37                    int height = i - k + 1;
38                    Ans = Math.max(Ans, currWidth * height);
39                }
40            }
41        }
42
43        return Ans;
44    }
45}