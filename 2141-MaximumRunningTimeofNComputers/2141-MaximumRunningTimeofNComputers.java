// Last updated: 12/1/2025, 10:16:28 PM
1class Solution {
2    public long maxRunTime(int n, int[] batteries) {
3        Arrays.sort(batteries);
4        long extra = 0;
5        for (int i = 0; i < batteries.length - n; i++) {
6            extra += batteries[i];
7        }
8
9        int[] live = Arrays.copyOfRange(batteries, batteries.length - n, batteries.length);
10        for (int i = 0; i < n - 1; i++) {
11            if (extra < (long)(i + 1) * (live[i + 1] - live[i])) {
12                return live[i] + extra / (long)(i + 1);
13            }
14            extra -= (long)(i + 1) * (live[i + 1] - live[i]);
15        }
16        return live[n - 1] + extra / n;
17    }
18}