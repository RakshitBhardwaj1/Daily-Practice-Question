// Last updated: 1/3/2026, 6:20:21 PM
1class Solution {
2    public int numOfWays(int n) {
3        final int MOD = 1_000_000_007;
4        long A = 6, B = 6;
5        
6        for (int i = 2; i <= n; i++) {
7            long newA = (2 * A + 2 * B) % MOD;
8            long newB = (2 * A + 3 * B) % MOD;
9            A = newA;
10            B = newB;
11        }
12        
13        return (int) ((A + B) % MOD);
14    }
15}