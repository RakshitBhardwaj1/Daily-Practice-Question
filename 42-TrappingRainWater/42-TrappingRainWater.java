// Last updated: 9/18/2026, 2:53:01 PM
1class Solution {
2    public int trap(int[] height) {
3        int n=height.length;
4        int l=0;
5        int r=n-1;
6        int lmax=0;
7        int rmax=0;
8        int total=0;
9        while(l<r){
10            if(height[l]<=height[r]){
11                if(lmax>height[l]){
12                    total+=lmax-height[l];
13                }
14                else{
15                    lmax=height[l];
16                }
17                l=l+1;                
18            }
19            else{
20                if(rmax>height[r]){
21                    total+=rmax-height[r];
22                }
23                else{
24                    rmax=height[r];
25                }
26                r=r-1;
27            }
28        }
29        return total;
30
31    }
32}