// Last updated: 6/29/2026, 10:24:57 PM
1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int c=0;
4        for(String ch:patterns){
5            if(word.contains(ch)){
6                c++;
7            }
8        }
9        return c;
10    }
11}