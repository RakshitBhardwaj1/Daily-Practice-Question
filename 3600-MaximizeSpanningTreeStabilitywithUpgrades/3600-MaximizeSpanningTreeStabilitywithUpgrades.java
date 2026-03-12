// Last updated: 3/12/2026, 10:37:11 PM
1class DSU {
2    int[] parent;
3    int[] rank;
4    int components;
5
6    public DSU(int n) {
7        parent = new int[n];
8        rank = new int[n];
9        components = n;
10
11        for (int i = 0; i < n; i++) {
12            parent[i] = i;
13        }
14    }
15
16    public int find(int x) {
17        if (parent[x] != x) {
18            parent[x] = find(parent[x]);
19        }
20        return parent[x];
21    }
22
23    public boolean unite(int a, int b) {
24        int pa = find(a);
25        int pb = find(b);
26
27        if (pa == pb) return false;
28
29        if (rank[pa] < rank[pb]) {
30            int temp = pa;
31            pa = pb;
32            pb = temp;
33        }
34
35        parent[pb] = pa;
36
37        if (rank[pa] == rank[pb]) {
38            rank[pa]++;
39        }
40
41        components--;
42        return true;
43    }
44}
45
46class Solution {
47
48    public boolean canAchieve(int n, int[][] edges, int k, int x) {
49        DSU dsu = new DSU(n);
50
51        // Mandatory edges
52        for (int[] e : edges) {
53            int u = e[0], v = e[1], s = e[2], must = e[3];
54
55            if (must == 1) {
56                if (s < x) return false;
57                if (!dsu.unite(u, v)) return false;
58            }
59        }
60
61        // Free optional edges
62        for (int[] e : edges) {
63            int u = e[0], v = e[1], s = e[2], must = e[3];
64
65            if (must == 0 && s >= x) {
66                dsu.unite(u, v);
67            }
68        }
69
70        // Upgrade edges
71        int usedUpgrades = 0;
72
73        for (int[] e : edges) {
74            int u = e[0], v = e[1], s = e[2], must = e[3];
75
76            if (must == 0 && s < x && 2 * s >= x) {
77                if (dsu.unite(u, v)) {
78                    usedUpgrades++;
79                    if (usedUpgrades > k) return false;
80                }
81            }
82        }
83
84        return dsu.components == 1;
85    }
86
87    public int maxStability(int n, int[][] edges, int k) {
88
89        // Check mandatory cycle
90        DSU dsu = new DSU(n);
91
92        for (int[] e : edges) {
93            if (e[3] == 1) {
94                if (!dsu.unite(e[0], e[1])) {
95                    return -1;
96                }
97            }
98        }
99
100        int low = 1, high = 200000;
101        int ans = -1;
102
103        while (low <= high) {
104            int mid = low + (high - low) / 2;
105
106            if (canAchieve(n, edges, k, mid)) {
107                ans = mid;
108                low = mid + 1;
109            } else {
110                high = mid - 1;
111            }
112        }
113
114        return ans;
115    }
116}