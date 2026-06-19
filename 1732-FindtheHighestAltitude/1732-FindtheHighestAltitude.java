// Last updated: 6/19/2026, 8:28:17 PM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int n=gain.length;
4        int max=Integer.MIN_VALUE;
5        int diff=0;
6        for(int i=0;i<n;i++){
7            diff=diff+gain[i];
8            max=Math.max(max,diff);
9        }
10        if(max<0){
11            return 0;
12        }
13        return max;
14    }
15}