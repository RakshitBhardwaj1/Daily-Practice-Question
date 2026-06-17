// Last updated: 6/17/2026, 11:11:22 PM
1class Solution {
2    public char processStr(String s, long k) {
3        int n = s.length();
4        long[] lens = new long[n];
5        long len = 0;
6
7        for (int i = 0; i < n; i++) {
8            char c = s.charAt(i);
9            if (c == '*')
10                len = Math.max(len - 1, 0L);
11            else if (c == '#')
12                len *= 2;
13            else if (c != '%')
14                len++;
15            
16            lens[i] = len;
17        }
18
19        if (k >= len) return '.';
20
21        for (int i = n - 1; ; i--) {
22            char c = s.charAt(i);
23            switch (c) {
24                case '*':
25                    break;
26                case '#':
27                    if (k >= lens[i] / 2)
28                        k -= lens[i] / 2;
29                    break;
30                case '%':
31                    k = lens[i] - 1 - k;
32                    break;
33                default:
34                    if (lens[i] == k + 1)
35                        return c;
36            }
37        }
38    }
39}