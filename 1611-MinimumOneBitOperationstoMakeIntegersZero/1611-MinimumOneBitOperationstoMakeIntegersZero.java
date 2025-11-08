// Last updated: 11/8/2025, 5:41:25 PM
class Solution {
    public int minimumOneBitOperations(int n) {
        if(n==0){
            return 0;
        }
        int k=0;
        int curr=1;
        while(curr*2<=n){
            curr*=2;
            k++;
        }
        return (1<<(k+1))-1-minimumOneBitOperations(n^curr);
    }
}