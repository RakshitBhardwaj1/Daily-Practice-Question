// Last updated: 11/11/2025, 8:39:10 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int low=0;
        while(low<n-1){
            if(nums[low]!=nums[low+1]){
                return nums[low];
            }
            low=low+2;
        }
        return nums[n-1];
    }
}