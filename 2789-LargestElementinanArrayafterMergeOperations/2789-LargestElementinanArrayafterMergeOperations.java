// Last updated: 10/12/2025, 4:00:45 PM
class Solution {
    public long maxArrayValue(int[] nums) {
        long sum = nums[nums.length - 1]; // start from last element
        long maxVal = sum;
        
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] <= sum) {
                sum += nums[i]; // merge
            } else {
                sum = nums[i]; 
            }
            maxVal = Math.max(maxVal, sum);
        }
        return maxVal;
    }
}
