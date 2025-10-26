// Last updated: 10/26/2025, 8:33:01 PM
class Solution {
    public int appendCharacters(String s, String t) {
        int sI=0;
        int tI=0;
        int sLen=s.length();
        int tLen=t.length();
        while(sI<sLen && tI<tLen){
            if(s.charAt(sI)==t.charAt(tI)){
                tI++;
            }
            sI++;
        }
        return tLen-tI;
    }
}