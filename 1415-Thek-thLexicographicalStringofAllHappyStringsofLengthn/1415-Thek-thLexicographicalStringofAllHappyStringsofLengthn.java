// Last updated: 3/14/2026, 6:37:40 PM
1class Solution {
2    public String getHappyString(int n, int k) {
3        int total = 3 * (1<<(n-1));
4        if(k>total) return "";
5        k--;
6        StringBuilder res=new StringBuilder();
7        char last='\0';
8        for(int pos=0;pos<n;pos++){
9            int branch=1<<(n-pos-1);
10            List<Character> choices=new ArrayList<>();
11            for(char c:new char[]{'a','b','c'})
12                if(c!=last) choices.add(c);
13
14            int idx=k/branch;
15            res.append(choices.get(idx));
16            last=choices.get(idx);
17            k%=branch;
18        }
19        return res.toString();
20    }
21}