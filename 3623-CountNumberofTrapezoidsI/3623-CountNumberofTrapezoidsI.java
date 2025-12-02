// Last updated: 12/2/2025, 7:30:44 PM
1class Solution {
2    public int countTrapezoids(int[][] points) {
3        Map<Integer, Integer> pointNum = new HashMap<>();
4        final int mod = 1000000007;
5        long ans = 0;
6        long sum = 0;
7        for (int[] point : points) {
8            pointNum.put(point[1], pointNum.getOrDefault(point[1], 0) + 1);
9        }
10        for (int pNum : pointNum.values()) {
11            long edge = ((long) pNum * (pNum - 1)) / 2;
12            ans = (ans + edge * sum) % mod;
13            sum = (sum + edge) % mod;
14        }
15        return (int) ans;
16    }
17}