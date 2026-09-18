// Last updated: 9/18/2026, 3:48:51 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int n=height.length;
4        int l=0;
5        int r=n-1;
6        int total=Integer.MIN_VALUE;
7        while(l<r){
8            if(height[l]<=height[r]){
9                total=Math.max(total,(r-l)*height[l]);
10                l++;
11            }
12            else{
13                total=Math.max(total,(r-l)*height[r]);
14                r--;
15            }
16        }
17        return total;
18    }
19}