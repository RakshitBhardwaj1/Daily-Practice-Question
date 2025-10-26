// Last updated: 10/26/2025, 8:24:26 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp=0;
        int tp=0;
        while(sp<s.length()&& tp<t.length()){
            if(s.charAt(sp)==t.charAt(tp)){
                sp++;
            }
            tp++;
        }
        return sp==s.length();
    }
}