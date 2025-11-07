// Last updated: 11/7/2025, 11:05:06 PM
class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int pos_count=0;
        int neg_count=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                neg_count++;
            }
            if(nums[i]>0){
                pos_count++;
            }
        }
        return Math.max(pos_count,neg_count);
    }
    
}