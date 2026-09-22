// Last updated: 9/22/2026, 9:33:15 PM
1class Solution {
2    public int rob(int[] nums) {
3        int n=nums.length;
4        if(n<2){
5            return nums[0];
6        }
7        int[] skipfirst=new int[n-1];
8        int[] skiplast=new int[n-1];
9
10        for(int i=0;i<n-1;i++){
11            skipfirst[i]=nums[i];
12            skiplast[i]=nums[i+1];
13        }
14        int lootskipfirst=robhelper(skipfirst);
15        int lootskiplast=robhelper(skiplast);
16
17        return Math.max(lootskipfirst,lootskiplast);
18    }
19    public int robhelper(int[] arr){
20        int n=arr.length;
21        if(n<2){
22            return arr[0];
23        }
24        int[] dp=new int[n];
25        dp[0]=arr[0];
26        dp[1]=Math.max(arr[0],arr[1]);
27        for(int i=2;i<n;i++){
28            dp[i]=Math.max(dp[i-2]+arr[i],dp[i-1]);
29        }
30        return dp[n-1];
31    }
32}