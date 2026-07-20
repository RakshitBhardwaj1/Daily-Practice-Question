// Last updated: 7/20/2026, 12:15:45 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int n=matrix.length;
4        for(int[] arr:matrix){
5            int low=0;
6            int high=arr.length;
7            while(low<high){
8                int mid=low+(high-low)/2;
9                if(arr[mid]==target){
10                    return true;
11                }
12                if(arr[mid]<target){
13                    low=mid+1;
14                }
15                else{
16                    high=mid;
17                }
18            }
19        }
20        return false;
21
22    }
23    
24}