// Last updated: 9/7/2026, 5:56:36 PM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        if(cost.length==1) return cost[0];
4        if(cost.length==2) return Math.min(cost[0],cost[1]);
5
6        int cost1=cost[0];
7        int cost2=cost[1];
8
9        for(int i=2;i<cost.length;i++){
10            int cur=Math.min(cost1,cost2)+cost[i];
11            cost1=cost2;
12            cost2=cur;
13        }
14        return Math.min(cost1,cost2);
15   }
16}