// Last updated: 1/21/2026, 11:33:02 AM
1class Solution {
2    public boolean doesValidArrayExist(int[] derived) {
3        int c=0;
4        for(int num:derived){
5            c^=num;
6        }
7        return c==0;
8    }
9}