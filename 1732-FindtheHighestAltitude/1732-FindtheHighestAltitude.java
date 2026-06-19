// Last updated: 6/19/2026, 8:52:02 PM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        int n=nums.length;
4        int k=0;
5        int[] arr=new int[n];
6        for(int num:nums){
7            if(num<pivot){
8                arr[k++]=num;
9            }
10            
11        }
12        for(int num:nums){
13            if(num==pivot){
14                arr[k++]=num;
15            }
16        }
17        for(int num:nums){
18            if(num>pivot){
19                arr[k++]=num;
20            }
21        }
22        return arr;
23    }
24}