// Last updated: 10/26/2025, 9:28:56 AM
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = nums[i];
        Arrays.sort(idx, (a, b) -> Long.compare(Math.abs(b), Math.abs(a)));
        
        int k = (n + 1) / 2; 
        long score = 0L;
        for (int i = 0; i < n; i++) {
            long val = (long) idx[i];
            long sq = val * val;
            if (i < k) score += sq;
            else score -= sq;
        }
        return score;
    }
}