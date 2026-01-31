// Last updated: 1/31/2026, 8:24:36 AM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        for(char ch:letters){
4            if(ch>target){
5                return ch;
6            }
7        }
8        return letters[0];
9    }
10}