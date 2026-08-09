// Last updated: 8/9/2026, 3:51:52 PM
1class Solution {
2    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
3        int c1=coordinate1.charAt(0)-'a';
4        int c2=coordinate2.charAt(0)-'a';
5        int n1=coordinate1.charAt(1)-'0';
6        int n2=coordinate2.charAt(1)-'0';
7        if((c1+n1)%2==(c2+n2)%2){
8            return true;
9        }
10        return false;
11    }
12}