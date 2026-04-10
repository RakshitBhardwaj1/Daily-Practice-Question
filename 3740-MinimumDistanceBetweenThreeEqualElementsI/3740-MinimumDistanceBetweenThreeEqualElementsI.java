// Last updated: 4/10/2026, 11:02:53 PM
1// Added using AI
2class Solution {
3    public int minimumDistance(int[] nums) {
4        int n = nums.length ;
5        if (n <= 2) return -1 ;
6        int ans = Integer.MAX_VALUE;
7        for (int i = 0; i < n; i++)
8            for (int j = i+1; j < n; j++)
9                if (nums[i] == nums[j])
10                    for (int k = j+1; k < n; k++)
11                        if (nums[j] == nums[k])
12                            ans = Math.min(ans, 2*(k-i)) ;
13        return ans == Integer.MAX_VALUE ? -1 : ans;
14    }
15}