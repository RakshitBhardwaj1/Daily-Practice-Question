// Last updated: 1/29/2026, 9:38:33 PM
1class Solution {
2    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
3        int n = 26;
4        long INF = (long) 1e12;
5        long[][] dist = new long[n][n];
6        for (int i = 0; i < n; i++) {
7            for (int j = 0; j < n; j++) {
8                if (i == j) dist[i][j] = 0;
9                else dist[i][j] = INF;
10            }
11        }
12        for (int i = 0; i < original.length; i++) {
13            int u = original[i] - 'a';
14            int v = changed[i] - 'a';
15            dist[u][v] = Math.min(dist[u][v], cost[i]);
16        }
17        for (int k = 0; k < n; k++) {
18            for (int i = 0; i < n; i++) {
19                for (int j = 0; j < n; j++) {
20                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
21                        dist[i][j] = dist[i][k] + dist[k][j];
22                    }
23                }
24            }
25        }
26        long ans = 0;
27        for (int i = 0; i < source.length(); i++) {
28            char s = source.charAt(i);
29            char t = target.charAt(i);
30
31            if (s == t) continue;
32
33            long c = dist[s - 'a'][t - 'a'];
34            if (c == INF) return -1;
35
36            ans += c;
37        }
38
39        return ans;
40    }
41}
42