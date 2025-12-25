// Last updated: 12/25/2025, 9:53:02 PM
1class Solution {
2    public long maximumHappinessSum(int[] happiness, int k) {
3        Arrays.sort(happiness);
4        int count = 0;
5        long res = 0;
6        for(int i=happiness.length-1;i>=happiness.length-k;i--){
7            if(happiness[i] + count > 0){
8                res+=(long)(happiness[i] + count);
9            }
10            count--;
11        }
12
13        return res;
14    }
15}