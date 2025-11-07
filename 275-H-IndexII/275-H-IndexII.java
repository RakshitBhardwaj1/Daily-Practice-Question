// Last updated: 11/7/2025, 9:45:08 PM
class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int h=n-mid;// h index
            if(citations[mid]==h){
                return h;
            }
            else if(citations[mid]<=h){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return n-low;
    }
}