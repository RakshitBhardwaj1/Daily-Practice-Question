// Last updated: 11/17/2025, 2:39:51 PM
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n=nums.length;
        int index=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                if(index!=-1 && i-index-1<k){
                    return false;
                }
                index=i;
            }
            
        }
        return true;
    }
}