// Last updated: 10/21/2025, 4:53:08 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<Integer>();
        for(int c:nums){
            set.add(c);
        }
        if(nums.length==set.size()){
            return false;
        }
        return true;
    }
}