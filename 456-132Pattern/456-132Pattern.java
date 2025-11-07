// Last updated: 11/7/2025, 11:18:35 PM
class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;
        
        Deque<Integer> stack = new ArrayDeque<>();
        int ak = Integer.MIN_VALUE;
        
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < ak) {
                return true;
            }
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                ak = stack.pop();
            }
            stack.push(nums[i]);
        }
        
        return false;
    }
}
