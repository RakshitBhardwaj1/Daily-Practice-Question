// Last updated: 10/24/2025, 10:46:25 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int[] out=new int[nums.length];
        if(nums.length==0){
            return out;
        }
        out[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            out[i]=out[i-1]+nums[i];
        }
        return out;
    }
}