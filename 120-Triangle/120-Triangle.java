// Last updated: 1/16/2026, 9:47:21 AM
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3        int n=triangle.size();
4        int[] dp=new int[n];
5        if (triangle.size()==1) {
6            return triangle.get(n-1).get(0);
7        }
8        for(int i=0;i<n;i++){
9            dp[i]=triangle.get(n-1).get(i);
10        }
11        for(int i=n-2;i>=0;i--){
12            for(int j=0;j<=i;j++){
13                dp[j]=triangle.get(i).get(j)+Math.min(dp[j],dp[j+1]);
14            }
15        }
16        return dp[0];
17    }
18}