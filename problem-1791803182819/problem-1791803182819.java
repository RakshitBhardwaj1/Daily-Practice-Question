// Last updated: 10/12/2026, 4:36:22 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int l=0;
4        int n=height.length;
5        int total=0;
6        int[] arr=height;
7        int r=n-1;
8        while(l<r){
9            if(arr[l]<arr[r]){
10                total=Math.max((r-l)*arr[l],total);
11                l++;
12            }
13            else{
14                total=Math.max((r-l)*arr[r],total);
15                r--;
16            }
17        }
18        return total;
19    }
20}