// Last updated: 12/9/2025, 10:31:18 PM
1class Solution {
2    final static int mod=(int)1e9+7, M=(int)1e5+1;
3    public int specialTriplets(int[] nums) {
4        final int  n=nums.length;
5        int [] freq=new int[M];
6        int [] prev=new int[M];
7        for(int x: nums) freq[x]++;
8        long cnt=0;
9        prev[nums[0]]++;
10        for(int i=1; i<n-1; i++){
11            final int x=nums[i], x2=x<<1;
12            if (x2<M)
13                cnt+=(long)prev[x2]*(freq[x2]-prev[x2]-(x==0?1:0));
14            prev[x]++;
15        }
16        return (int)(cnt%mod);
17    }
18}