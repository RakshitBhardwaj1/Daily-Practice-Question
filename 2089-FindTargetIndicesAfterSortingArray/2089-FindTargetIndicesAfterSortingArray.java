// Last updated: 10/25/2025, 8:02:26 PM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> ll=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                ll.add(i);
            }
        }
        return ll;
    }
}