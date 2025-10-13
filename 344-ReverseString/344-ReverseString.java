// Last updated: 10/13/2025, 11:05:11 PM
class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;

        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;

            start++;
            end--;
        }
    }
}