// Last updated: 10/14/2025, 10:26:54 PM
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int pre = 0, cur = 0, mx = 0;
        int n = nums.size();
        for (int i = 0; i < n; ++i) {
            cur++;
            if (i == n - 1 || nums.get(i) >= nums.get(i + 1)) {
                mx = Math.max(mx, Math.max(cur / 2, Math.min(pre, cur)));
                pre = cur;
                cur = 0;
            }
        }
        return mx >= k;
    }
}
