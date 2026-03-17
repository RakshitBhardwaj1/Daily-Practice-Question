// Last updated: 3/17/2026, 9:34:13 PM
1class Solution {
2    public int largestSubmatrix(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        int maxArea = 0;
6        // Build heights
7        for(int i=1;i<m;i++){
8            for(int j=0;j<n;j++){
9                if(matrix[i][j] == 1){
10                    matrix[i][j] += matrix[i-1][j];
11                }
12            }
13        }
14        for(int i=0;i<m;i++){
15            int[] row = matrix[i].clone();
16            Arrays.sort(row);
17            for(int j=0;j<n;j++){
18                int height = row[j];
19                int width = n - j;
20                maxArea = Math.max(maxArea, height * width);
21            }
22        }
23        return maxArea;
24    }
25}