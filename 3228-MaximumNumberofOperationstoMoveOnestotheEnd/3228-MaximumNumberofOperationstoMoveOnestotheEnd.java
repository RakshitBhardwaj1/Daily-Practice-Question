// Last updated: 11/13/2025, 6:59:31 AM
class Solution {
    public int maxOperations(String s) {
        int one=0;
        int n=s.length();
        int ans=0;
        int i=0;
        while(i<n){
            if(s.charAt(i)=='0'){
                while(i+1<n&&s.charAt(i+1)=='0'){
                    i++;
                }
                ans+=one;
            }
            else{
                one++;
            }
            i++;
        }
        return ans;
    }
}