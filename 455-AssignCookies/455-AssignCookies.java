// Last updated: 1/24/2026, 4:35:47 PM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int i=0;
6        int j=0;
7        int ans=0;
8        while(i<g.length && j<s.length){
9            if(g[i]<=s[j]){
10                ans++;
11                i++;
12            }
13            j++;
14        }
15        return ans;
16    }
17}