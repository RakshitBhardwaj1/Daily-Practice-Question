// Last updated: 10/20/2025, 2:57:26 PM
class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int mid = (n + 1) / 2;  // midpoint for smaller half
        int j = n - 1;          // pointer for larger half
        int i = mid - 1;        // pointer for smaller half

        for (int k = 0; k < n; k++) {
            if (k % 2 == 0) {
                nums[k] = sorted[i--];
            } else {
                nums[k] = sorted[j--];
            }
        }
    }
}