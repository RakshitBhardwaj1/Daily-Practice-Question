// Last updated: 9/26/2026, 3:32:44 PM
1class Solution {
2    public int jump(int[] nums) {
3        int n=nums.length;
4        int totaljump=0;
5        int destination=n-1;
6        int coverage=0;
7        int lastjumpidx=0;
8        if(n==1){
9            return 0;
10        }
11        for(int i=0;i<n;i++){
12            coverage=Math.max(coverage,i+nums[i]);
13            if(i==lastjumpidx){
14                lastjumpidx=coverage;
15                totaljump++;
16
17                if(coverage>=destination){
18                    return totaljump;
19                }
20            }
21        }
22        return totaljump;
23    }
24}