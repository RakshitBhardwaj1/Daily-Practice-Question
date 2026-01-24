// Last updated: 1/24/2026, 7:09:07 PM
1import java.util.*;
2
3class Solution {
4    public int minimumCost(int[] cost) {
5        Arrays.sort(cost);
6        int ans=0;
7        int count=0;
8        for(int i=cost.length-1;i>=0;i--){
9            count++;
10            if(count%3!=0){
11                ans+=cost[i];
12            }
13        }
14        return ans;
15    }
16}
17