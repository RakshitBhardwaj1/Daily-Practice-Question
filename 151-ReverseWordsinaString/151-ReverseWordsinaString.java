// Last updated: 1/16/2026, 9:08:27 PM
1class Solution {
2    public String reverseWords(String s) {
3        s=s.trim(); // trim use to remove the starting and ending spaces of the string
4        String[] words=s.split("\\s+"); //split use to split the string into array  spaces between the string
5        StringBuilder sb=new StringBuilder();
6        int n=words.length;
7        for(int i=n-1;i>=0;i--){
8            sb.append(words[i]);
9            if(i!=0){
10                sb.append(" ");
11            }
12        }
13        return sb.toString();
14    }
15}