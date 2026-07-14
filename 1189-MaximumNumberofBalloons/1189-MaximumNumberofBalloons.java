// Last updated: 7/14/2026, 10:21:17 PM
1class Solution {
2    public int maxNumberOfBalloons(String s) {
3        int[] f = new int[5];
4        String t = "balon";
5
6        for (int i = 0; i < s.length(); i++)
7            for (int j = 0; j < 5; j++)
8                if (s.charAt(i) == t.charAt(j))
9                    f[j]++;
10
11        f[2] >>= 1;
12        f[3] >>= 1;
13
14        return Arrays.stream(f).min().getAsInt();
15    }
16}