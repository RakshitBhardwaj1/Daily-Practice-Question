// Last updated: 3/10/2026, 10:10:26 PM
1class Solution {
2
3    static final int MOD = 1000000007;
4    int[][][] memo;
5    int limit;
6
7    public int numberOfStableArrays(int zero, int one, int limit) {
8        this.memo = new int[zero + 1][one + 1][2];
9        for (int i = 0; i <= zero; i++) {
10            for (int j = 0; j <= one; j++) {
11                Arrays.fill(memo[i][j], -1);
12            }
13        }
14        this.limit = limit;
15        return (dp(zero, one, 0) + dp(zero, one, 1)) % MOD;
16    }
17
18    public int dp(int zero, int one, int lastBit) {
19        if (zero == 0) {
20            return (lastBit == 0 || one > limit) ? 0 : 1;
21        } else if (one == 0) {
22            return (lastBit == 1 || zero > limit) ? 0 : 1;
23        }
24
25        if (memo[zero][one][lastBit] == -1) {
26            int res = 0;
27            if (lastBit == 0) {
28                res = (dp(zero - 1, one, 0) + dp(zero - 1, one, 1)) % MOD;
29                if (zero > limit) {
30                    res = (res - dp(zero - limit - 1, one, 1) + MOD) % MOD;
31                }
32            } else {
33                res = (dp(zero, one - 1, 0) + dp(zero, one - 1, 1)) % MOD;
34                if (one > limit) {
35                    res = (res - dp(zero, one - limit - 1, 0) + MOD) % MOD;
36                }
37            }
38            memo[zero][one][lastBit] = res % MOD;
39        }
40        return memo[zero][one][lastBit];
41    }
42}