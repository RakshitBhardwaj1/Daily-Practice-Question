// Last updated: 7/2/2026, 5:05:08 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int k=nums1.length;
4        int m=nums2.length;
5        int[] arr=new int[k];
6        for(int l=0;l<k;l++){
7            int idx=-1;
8            for(int i=0;i<m;i++){
9                if(nums2[i]==nums1[l]){
10                    idx=i;
11                    break;
12                }
13            }
14            int ans=-1;
15            for(int i=idx+1;i<m;i++){
16                if(nums2[i]>nums1[l]){
17                    ans=nums2[i];
18                    break;
19                }
20            }
21            arr[l]=ans;
22        }
23        return arr;
24    }
25}