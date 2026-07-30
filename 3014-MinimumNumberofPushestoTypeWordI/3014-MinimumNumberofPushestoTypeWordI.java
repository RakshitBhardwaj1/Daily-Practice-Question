// Last updated: 7/30/2026, 4:10:47 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int ans=0;
4        for(int i=0;i<word.length();i++){
5            ans+=(i/8)+1;
6        }
7        return ans;
8    }
9}