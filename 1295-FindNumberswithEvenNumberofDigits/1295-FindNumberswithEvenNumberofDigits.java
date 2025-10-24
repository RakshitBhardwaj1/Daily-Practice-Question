// Last updated: 10/24/2025, 12:00:21 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n:nums){
            int ans=0;
            int c=0;
            while(n>0){
                ans=n%10;
                n=n/10;
                c++;
            }
            if(c%2==0){
                count++;
            }
        }
        return count;
    }
}