// Last updated: 11/23/2025, 11:26:52 AM
class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[]{0, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int num : nums) {
            int[] tmp = dp.clone();
            for (int i = 0; i < 3; i++) {
                if (tmp[i] != Integer.MIN_VALUE) {
                    int newSum = tmp[i] + num;
                    int idx = ((newSum % 3) + 3) % 3; // normalize modulo
                    dp[idx] = Math.max(dp[idx], newSum);
                }
            }
        }

        return dp[0];
    }
}
