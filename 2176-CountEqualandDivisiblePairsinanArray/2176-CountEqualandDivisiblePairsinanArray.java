// Last updated: 11/22/2025, 10:59:03 PM
class Solution {
    public int countPairs(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((i * j) % k == 0 && nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}