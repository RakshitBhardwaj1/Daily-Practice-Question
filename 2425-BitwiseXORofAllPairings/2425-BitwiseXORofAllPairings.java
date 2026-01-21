// Last updated: 1/21/2026, 11:55:29 AM
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3        int n=nums1.length;
4        int m=nums2.length;
5        if(n%2==0 &m%2==0){
6            return 0;
7        }
8        int xor1=0;
9        for(int i:nums1){
10            xor1^=i;
11        }
12        int xor2=0;
13        for(int j:nums2){
14            xor2^=j;
15        }
16        if(n%2==1 & m%2==1){
17            return xor1^xor2;
18        }
19        else if(n%2==1){
20            return xor2;
21        }else{
22            return xor1;
23        }
24    }
25}