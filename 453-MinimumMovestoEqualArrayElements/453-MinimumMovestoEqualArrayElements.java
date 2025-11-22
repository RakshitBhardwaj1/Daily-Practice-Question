// Last updated: 11/22/2025, 10:29:49 AM
class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int count=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=min){
                count+=nums[i]-min;
            }
        }
        return count;
    }
}