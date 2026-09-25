// Last updated: 9/25/2026, 10:15:19 PM
1class Solution {
2    public int trap(int[] height) {
3        int n=height.length;
4        int lmax=0;
5        int rmax=0;
6        int l=0;
7        int r=n-1;
8        int total=0;
9        while(l<r){
10            if(height[l]<=height[r]){
11                if(lmax>height[l]){
12                    total+=lmax-height[l];
13                }
14                else{
15                lmax=height[l];
16                }
17                l=l+1;
18            }
19            else{
20                if(rmax>height[r]){
21                    total+=rmax-height[r];
22                }
23                else{
24                rmax=height[r];
25                }
26                r=r-1;
27            }
28        }
29        return total;
30    }
31}