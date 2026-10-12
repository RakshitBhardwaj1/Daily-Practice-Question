// Last updated: 10/12/2026, 5:04:20 PM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int m=text1.length();
4        int n=text2.length();
5        int[][] dp=new int[m+1][n+1];
6        
7        for(int i=1;i<=m;i++){
8            for(int j=1;j<=n;j++){
9                if(text1.charAt(i-1)==text2.charAt(j-1)){
10                    dp[i][j]=1+dp[i-1][j-1];
11                }
12                else{
13                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
14                }
15            }
16        }
17        return dp[m][n];
18    }
19}