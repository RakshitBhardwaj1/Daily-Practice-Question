// Last updated: 9/21/2026, 3:13:33 PM
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        HashSet<String> set=new HashSet<>(wordDict);
4        int maxlen=0;
5        for(String w:wordDict){
6            maxlen=Math.max(maxlen,w.length());
7        }
8        int n=s.length();
9        boolean[] dp=new boolean[n+1];
10        dp[0]=true;
11
12        for(int i=1;i<=n;i++){
13            for(int j=i-1;j>=Math.max(0,i-maxlen);j--){
14                if(dp[j] && wordDict.contains(s.substring(j,i))){
15                    dp[i]=true;
16                }
17            }
18        }
19        return dp[n];
20    }
21}