// Last updated: 3/2/2026, 1:17:50 PM
1class Solution {
2
3    public int minSwaps(int[][] grid) {
4        int n = grid.length;
5        int[] pos = new int[n];
6        Arrays.fill(pos, -1);
7        for (int i = 0; i < n; ++i) {
8            for (int j = n - 1; j >= 0; --j) {
9                if (grid[i][j] == 1) {
10                    pos[i] = j;
11                    break;
12                }
13            }
14        }
15        int ans = 0;
16        for (int i = 0; i < n; ++i) {
17            int k = -1;
18            for (int j = i; j < n; ++j) {
19                if (pos[j] <= i) {
20                    ans += j - i;
21                    k = j;
22                    break;
23                }
24            }
25            if (k >= 0) {
26                for (int j = k; j > i; --j) {
27                    int temp = pos[j];
28                    pos[j] = pos[j - 1];
29                    pos[j - 1] = temp;
30                }
31            } else {
32                return -1;
33            }
34        }
35        return ans;
36    }
37}