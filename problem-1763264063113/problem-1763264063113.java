// Last updated: 11/16/2025, 9:04:23 AM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (k != i && k != j) { 
                        int sum = nums[i] + nums[j] - nums[k];
                        maxSum = Math.max(maxSum, sum);
                    }
                }
            }
        }

        return maxSum;
    }
}
