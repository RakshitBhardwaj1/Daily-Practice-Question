// Last updated: 1/30/2026, 11:06:36 PM
1class Solution {
2    static final long INF = Long.MAX_VALUE;
3    public long minimumCost(String source, String target,
4                            String[] original, String[] changed, int[] cost) {
5
6        Map<String, Integer> id = new HashMap<>();
7        Set<Integer> lens = new HashSet<>();
8
9        int sz = 0;
10        int m = original.length;
11        int n = source.length();
12
13        long[][] dist = new long[201][201];
14        for (long[] row : dist) Arrays.fill(row, INF);
15
16        for (int i = 0; i < m; i++) {
17            if (!id.containsKey(original[i])) {
18                id.put(original[i], sz++);
19                lens.add(original[i].length());
20            }
21            if (!id.containsKey(changed[i])) {
22                id.put(changed[i], sz++);
23            }
24            int u = id.get(original[i]);
25            int v = id.get(changed[i]);
26            dist[u][v] = Math.min(dist[u][v], cost[i]);
27        }
28
29        for (int i = 0; i < sz; i++) dist[i][i] = 0;
30
31        for (int k = 0; k < sz; k++)
32            for (int i = 0; i < sz; i++)
33                if (dist[i][k] != INF)
34                    for (int j = 0; j < sz; j++)
35                        if (dist[k][j] != INF)
36                            dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
37
38        long[] dp = new long[n + 1];
39        Arrays.fill(dp, INF);
40        dp[0] = 0;
41
42        for (int i = 0; i < n; i++) {
43            if (dp[i] == INF) continue;
44
45            if (source.charAt(i) == target.charAt(i))
46                dp[i + 1] = Math.min(dp[i + 1], dp[i]);
47
48            for (int L : lens) {
49                if (i + L > n) continue;
50
51                String s = source.substring(i, i + L);
52                String t = target.substring(i, i + L);
53
54                if (id.containsKey(s) && id.containsKey(t)) {
55                    long d = dist[id.get(s)][id.get(t)];
56                    if (d != INF)
57                        dp[i + L] = Math.min(dp[i + L], dp[i] + d);
58                }
59            }
60        }
61
62        return dp[n] == INF ? -1 : dp[n];
63    }
64}