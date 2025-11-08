// Last updated: 11/8/2025, 9:55:58 AM
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int n:arr1){
            int valid=1;
            for(int m:arr2){
                if(Math.abs(n-m)<=d){
                    valid=0;
                    break;
                }
            }
            if(valid==1){
                count++;
            }
        }
        return count;
    }
}