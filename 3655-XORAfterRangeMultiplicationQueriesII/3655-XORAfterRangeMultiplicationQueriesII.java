// Last updated: 4/9/2026, 11:05:05 PM
1class Solution {
2    private static final int MOD = 1_000_000_007;
3
4    private long power(long base, long exp) {
5        long res = 1;
6        base %= MOD;
7        while (exp > 0) {
8            if ((exp & 1) == 1) res = (res * base) % MOD;
9            base = (base * base) % MOD;
10            exp >>= 1;
11        }
12        return res;
13    }
14
15    private long modInv(long n) {
16        return power(n, MOD - 2);
17    }
18
19    public int xorAfterQueries(int[] nums, int[][] queries) {
20        int n = nums.length;
21        int limit = (int) Math.sqrt(n);
22        
23        // Group queries with small k for later processing
24        Map<Integer, List<int[]>> lightK = new HashMap<>();
25
26        for (int[] q : queries) {
27            int l = q[0], r = q[1], k = q[2], v = q[3];
28            
29            if (k >= limit) { 
30                // Large k: apply brute force
31                for (int i = l; i <= r; i += k) {
32                    nums[i] = (int) ((1L * nums[i] * v) % MOD);
33                }
34            } else { 
35                // Small k: process later
36                lightK.computeIfAbsent(k, x -> new ArrayList<>()).add(q);
37            }
38        }
39
40        for (Map.Entry<Integer, List<int[]>> entry : lightK.entrySet()) {
41            int k = entry.getKey();
42            List<int[]> queryList = entry.getValue();
43            
44            // Process small queries grouped by step size k
45            long[] diff = new long[n];
46            Arrays.fill(diff, 1L);
47            
48            for (int[] q : queryList) {
49                int l = q[0], r = q[1], v = q[3];
50                
51                // Multiply starting position
52                diff[l] = (diff[l] * v) % MOD;
53                
54                // Cancel the multiplication using modular inverse
55                int steps = (r - l) / k;
56                int next = l + (steps + 1) * k;
57                if (next < n) {
58                    diff[next] = (diff[next] * modInv(v)) % MOD;
59                }
60            }
61            
62            // Propagate the multipliers with a step size of k
63            for (int i = 0; i < n; i++) {
64                if (i >= k) {
65                    diff[i] = (diff[i] * diff[i - k]) % MOD;
66                }
67                nums[i] = (int) ((1L * nums[i] * diff[i]) % MOD);
68            }
69        }
70
71        int ans = 0;
72        for (int num : nums) {
73            ans ^= num;
74        }
75
76        return ans;
77    }
78}