// Last updated: 8/9/2026, 3:45:54 PM
1class Solution {
2    public boolean squareIsWhite(String coordinates) {
3        int c=coordinates.charAt(0)-'a';
4        int n=coordinates.charAt(1)-'0';
5        if(c%2==n%2){
6            return true;
7        }
8        return false; 
9    }
10}