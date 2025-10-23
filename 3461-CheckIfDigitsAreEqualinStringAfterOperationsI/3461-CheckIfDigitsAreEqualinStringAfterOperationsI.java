// Last updated: 10/23/2025, 6:50:16 PM
class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            StringBuilder s1=new StringBuilder();
            for(int i=0;i<s.length()-1;i++){
                int sum=(s.charAt(i)-'0')+(s.charAt(i+1)-'0');
                s1.append(sum%10);
            }
            s=s1.toString();
        }
        return s.charAt(0)==s.charAt(1);
    }
}