// Last updated: 9/11/2026, 9:48:22 AM
1class Solution {
2    public int firstUniqChar(String s) {
3        HashMap<Character,Integer> map=new HashMap<>();
4		for(int i=0;i<s.length();i++) {
5			char ch=s.charAt(i);
6			map.put(ch, map.getOrDefault(ch, 0)+1);
7		}
8		for(int i=0;i<s.length();i++) {
9			char c=s.charAt(i);
10			if(map.get(c)==1) {
11				return i;
12			}
13		}
14        return -1;
15    }
16}