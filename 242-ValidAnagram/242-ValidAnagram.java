// Last updated: 8/1/2026, 8:45:37 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5        }
6        char[] ch=s.toCharArray();
7        char[] th=t.toCharArray();
8        Arrays.sort(ch);
9        Arrays.sort(th);
10        return Arrays.equals(ch,th);
11    }
12}
13