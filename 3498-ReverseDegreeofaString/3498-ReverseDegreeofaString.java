// Last updated: 9/20/2026, 11:02:50 AM
1class Solution {
2    public int reverseDegree(String s) {
3        int n=s.length();
4        int sum=0;
5        for(int i=0;i<n;i++){
6            char c=s.charAt(i);
7            sum+=('z'-c+1)*(i+1);
8        }
9        return sum;
10    }
11}