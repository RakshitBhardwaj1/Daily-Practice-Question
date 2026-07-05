// Last updated: 7/5/2026, 9:55:39 PM
1class Solution {
2    public int[] pathsWithMaxScore(List<String> board) {
3        final int MOD = 1_000_000_007;
4        int n = board.size();
5
6        int[] nextScore = new int[n + 1];
7        int[] nextWays = new int[n + 1];
8
9        Arrays.fill(nextScore, -1);
10
11        for (int i = n - 1; i >= 0; i--) {
12            int[] currScore = new int[n + 1];
13            int[] currWays = new int[n + 1];
14
15            Arrays.fill(currScore, -1);
16
17            for (int j = n - 1; j >= 0; j--) {
18                char cell = board.get(i).charAt(j);
19
20                if (cell == 'X') {
21                    continue;
22                }
23
24                if (cell == 'S') {
25                    currScore[j] = 0;
26                    currWays[j] = 1;
27                    continue;
28                }
29
30                int best = Math.max(
31                    nextScore[j],
32                    Math.max(currScore[j + 1], nextScore[j + 1])
33                );
34
35                if (best == -1) {
36                    continue;
37                }
38
39                long ways = 0;
40
41                if (nextScore[j] == best) {
42                    ways += nextWays[j];
43                }
44                if (currScore[j + 1] == best) {
45                    ways += currWays[j + 1];
46                }
47                if (nextScore[j + 1] == best) {
48                    ways += nextWays[j + 1];
49                }
50
51                int value = (cell == 'E') ? 0 : cell - '0';
52
53                currScore[j] = best + value;
54                currWays[j] = (int) (ways % MOD);
55            }
56
57            nextScore = currScore;
58            nextWays = currWays;
59        }
60
61        if (nextScore[0] == -1) {
62            return new int[]{0, 0};
63        }
64
65        return new int[]{nextScore[0], nextWays[0]};
66    }
67}