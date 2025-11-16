// Last updated: 11/16/2025, 10:11:50 AM
class Solution {
    public int numSub(String s) {
        long count=0;
        long ans=0;
        long mod=1000000007;
        for(char c:s.toCharArray()){
            if(c=='1'){
                count++;
            }
            else{
                ans=(ans+(count*(count+1))/2)%mod;
                count=0;
            }
        }
        ans=(ans+(count*(count+1))/2)%mod;
        return (int )ans;
    }
}