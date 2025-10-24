// Last updated: 10/24/2025, 5:53:29 PM
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalsum=0;
        for(int num:arr){
            totalsum+=num;
        }
        if(totalsum%3!=0){
            return false;
        }
        int c=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum==totalsum/3){
                c++;
                sum=0;

                if(c==2&&i<arr.length-1){
                    return true;
                }
            }
        }
        return false;
    }
}